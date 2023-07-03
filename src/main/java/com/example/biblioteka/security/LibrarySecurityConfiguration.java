//package com.example.biblioteka.security;
//
//import com.example.biblioteka.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.List;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//
//@AllArgsConstructor
//@Configuration
//public class LibrarySecurityConfiguration {
//    private final UserRepository userRepository;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authz) -> authz
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//    @Bean
//    User systemUser() {
//        return new User("systemUser", "", List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http
//                .authorizeRequests()
//                .requestMatchers(HttpMethod.GET, "/catalog/**", "/uploads/**", "/authors/**").permitAll()
//                .requestMatchers(HttpMethod.POST, "/orders", "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic()
//                .and()
//                .addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//    }
//}
