/*
* we need to tell spring security that we want to override some URL that's why we ave to extend web
* security configurer adapter
* */

package com.rdc.oauth2demo.SpringOauth2client.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
@Configuration
public class OAuthConfig extends WebSecurityConfigurerAdapter{

    /** with antMatcher I'm telling spring to authorize all the URL, but with antMatchers I'm
     * telling spring to give me an access.
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
           http.antMatcher("/")
                .authorizeRequests()
                   .antMatchers("/","/login**")
                   .permitAll()
                   .anyRequest()
                   .authenticated();
    }


}
