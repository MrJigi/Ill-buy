package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.SecurityBuilder;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = false, securedEnabled = true)
//extends SecurityConfigurerAdapter
public class SecurityConfig{

//    @Override
//    public void configure(SecurityBuilder builder) throws Exception {
////        super.configure(builder);
//        builder.authorizeRequests()
//                .requestMatchers("/api/users/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//    }

//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests()
//                .requestMatchers("/api/users/**").permitAll()
//                .requestMatchers("/private/**").authenticated()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//
//    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
//    }

}
