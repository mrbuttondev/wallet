package com.savings.hello;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class HelloWorld {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String init(){
        return "Init page";
    }
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "Hello micronaut!";
    }
}
