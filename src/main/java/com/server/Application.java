package com.server;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;
import io.micronaut.security.annotation.Secured;

import java.time.LocalDateTime;

import static io.micronaut.security.rules.SecurityRule.IS_ANONYMOUS;

@Controller
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
    @Secured(IS_ANONYMOUS)
    @Get("/profile")
    public Object getProfile(){
        return "My Profile Id is 9696 time :" + LocalDateTime.now();
    }
}