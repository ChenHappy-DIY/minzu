package com.chenxin.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author 陈鑫
 * @create 2020-10-17 11:35
 */
@Configuration
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests(authorizeRequests ->
                // 所有请求均放过, spring security 就没有什么用了
                // anyRequest() 限定任意的请求
                // permitAll() 无条件允许访问
                authorizeRequests.anyRequest().permitAll()
        );
    }
}
