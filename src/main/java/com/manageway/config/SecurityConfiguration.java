package com.manageway.config;

import com.manageway.usecase.user.FindUserUseCase;
import com.manageway.web.filter.AuthFilter;
import com.manageway.web.filter.util.AuthUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@EnableMethodSecurity
@Configuration
public class SecurityConfiguration {
    private final FindUserUseCase findUserUseCase;
    private final AuthUtil authUtil;

    public SecurityConfiguration(FindUserUseCase findUserUseCase, AuthUtil authUtil) {
        this.findUserUseCase = findUserUseCase;
        this.authUtil = authUtil;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers("/auth/**").permitAll()
                                .anyRequest()
                                .authenticated()
                )
                .exceptionHandling(exception ->
                        exception.authenticationEntryPoint((request, response, authException) -> {
                                    System.out.println(authException.getMessage());
                                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                                }

                        )
                )
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .addFilterBefore(authFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter(authUtil, userDetailsService());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return findUserUseCase::findByEmail;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
