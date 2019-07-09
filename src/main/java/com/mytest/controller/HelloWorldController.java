package com.mytest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "你好sayHello888";
    }



    @RequestMapping("/hehe")
    public String sayHehe(){
        return "hehe";
    }
}
