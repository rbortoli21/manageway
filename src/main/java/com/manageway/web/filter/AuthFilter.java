package com.manageway.web.filter;

import com.manageway.web.filter.util.AuthUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class AuthFilter extends OncePerRequestFilter {
    private final AuthUtil authUtil;
    private final UserDetailsService userDetailsService;

    public AuthFilter(AuthUtil authUtil, UserDetailsService userDetailsService) {
        this.authUtil = authUtil;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                    @NonNull HttpServletResponse response,
                                    @NonNull FilterChain filterChain) throws ServletException, IOException {

        final String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        final String jwt = header.substring(7);
        if (!hasValidToken(jwt, response))
            return;

        filterChain.doFilter(request, response);
    }

    private boolean hasValidToken(String jwt, HttpServletResponse response) {
        String username = authUtil.extractUsername(jwt);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (!authUtil.validateToken(jwt, userDetails)) {
            response.setStatus(401);
            return false;
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                userDetails, null, userDetails.getAuthorities());
        authenticationToken.setDetails(userDetails);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        return true;
    }
}
