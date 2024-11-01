package com.fkn.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security)
            throws
            Exception {
        security.authorizeHttpRequests(authorize -> authorize.requestMatchers("/",
                                                                              "/login",
                                                                              "/logout",
                                                                              "/access-denied")
                                                             .permitAll() // Những trang này không cần xác thực
                                                             .requestMatchers("/admin/dashboard")
                                                             .hasRole("ADMIN")) // Chỉ cho phép người dùng có vai trò USER truy cập
                .formLogin(form -> form.loginPage("/login")
                                       .defaultSuccessUrl("/admin/dashboard")
                                       .permitAll())
                .logout(logout -> logout.logoutUrl("/logout") // URL để thực hiện logout
                                        .logoutSuccessUrl("/login?logout=true") // Chuyển hướng về trang login sau khi logout
                                        .permitAll())
                .exceptionHandling(exception -> exception.accessDeniedPage("/access-denied")); // Trang lỗi khi không đủ quyền
        return security.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        PasswordEncoder encoder = passwordEncoder();
        return new InMemoryUserDetailsManager(User.builder()
                                                  .username("phnam")
                                                  .password(encoder.encode("12345"))
                                                  .roles("ADMIN")
                                                  .build());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
