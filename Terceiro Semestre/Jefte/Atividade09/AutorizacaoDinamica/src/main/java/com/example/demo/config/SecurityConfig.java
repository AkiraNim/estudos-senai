package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        jdbcUserDetailsManager.setUsersByUsernameQuery("SELECT usuario, senha, enabled FROM usuario where usuario = ?");

        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select usuario, papel from usuario inner join papel on usuario.id = papel.usuario_id where usuario = ?");

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(configurer -> {
            configurer
                    .requestMatchers("/api/admin/**").hasRole("ADMIN")
                    .requestMatchers( "/api/user/**").hasRole("USUARIO")
                    .requestMatchers( "/api/usuario/**").permitAll();
        });

        httpSecurity.httpBasic(Customizer.withDefaults());

        httpSecurity.csrf(csrf -> csrf.disable());

        return httpSecurity.build();
    }
}
