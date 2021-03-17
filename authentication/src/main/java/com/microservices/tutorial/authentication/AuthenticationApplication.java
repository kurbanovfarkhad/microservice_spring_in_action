package com.microservices.tutorial.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
@RestController
public class AuthenticationApplication {
    @RequestMapping(value = { "/user" }, produces = "application/json")
    public Map<String, Object> user(OAuth2Authentication user) {
        Map<String, Object> userInfo = new HashMap<>(){{
            put("user",user.getPrincipal());
            put("authorities", AuthorityUtils.authorityListToSet(user.getAuthorities()));
        }};
        return userInfo;
    }
    @RequestMapping(value = { "/" }, produces = "application/json")
    public Map<String, Object> asdf() {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        Map<String, Object> userInfo = new HashMap<>(){{
            put("user", "user.getUserAuthentication().getPrincipal()");
            put("authorities", "AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities())");
        }};
        return userInfo;
    }
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }

}
