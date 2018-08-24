package com.self.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
public class HelloController {

    @Autowired
    private ApplicationArguments applicationArguments;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloPage(ServletRequest request){
//        int i = 1/0;
        System.out.println(applicationArguments.getNonOptionArgs());
        return "hello page";
    }
}
