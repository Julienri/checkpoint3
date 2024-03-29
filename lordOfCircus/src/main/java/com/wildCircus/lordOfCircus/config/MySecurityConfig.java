package com.wildCircus.lordOfCircus.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
            .authorizeRequests()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/**.css").permitAll()
                .antMatchers("/**").permitAll()
            .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/profile", true)
                .permitAll()
                .failureUrl("/loginError")
                .permitAll()
            .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login");
    }
}