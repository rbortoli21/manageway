package com.manageway.web.filter.util;

import com.manageway.domain.TenantId;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

@Service
public class AuthUtil {
    private static final String SECRET_KEY = "4125432A462D4A614E645267556B58703273357638792F423F4528472B4B6250";

    public String generateToken(String username, TenantId tenantId) {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("tenantId", tenantId.stringValue());

        return generateToken(username, claims);
    }

    private String generateToken(String subject, HashMap<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(null)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public String extractJwt(String header) {
        return header.substring(7);
    }

    public boolean validateToken(String jwt, UserDetails userDetails) {
        String username = extractUsername(jwt);
        if (!username.isEmpty() && SecurityContextHolder.getContext().getAuthentication() == null) {
            return Objects.equals(userDetails.getUsername(), username);
        }
        return false;
    }

    public String extractUsername(String jwt) {
        return extractClaim(jwt, Claims::getSubject);
    }

    public String extractTenantId(String jwt) {
        return extractClaim(jwt, claims -> claims.get("tenantId", String.class));
    }

    private <T> T extractClaim(String jwt, Function<Claims, T> claimsResolver) {
        return claimsResolver.apply(extractAllClaims(jwt));
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token).getBody();
    }
}
