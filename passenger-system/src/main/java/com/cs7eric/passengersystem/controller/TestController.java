package com.cs7eric.passengersystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String test(){
        log.info("test");
        return "hello,this is a test";
    }

    @PostMapping("/login")
    public String login(){

        log.info("request is gotten!");
        return "this is a  login test";
    }
}
