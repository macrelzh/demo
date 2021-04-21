package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyixiao
 * @date 2021/4/18
 */
@RestController()
public class HelloWorldController {

    @GetMapping("/")
    public String helloAliyun() {


        return "Hello world!!!";
    }
}
