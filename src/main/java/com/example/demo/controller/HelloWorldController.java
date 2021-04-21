package com.example.demo.controller;

import com.example.demo.service.GetAndSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyixiao
 * @date 2021/4/18
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    GetAndSetService getAndSetService;

    @GetMapping()
    public String helloAliyun() {
        return "Hello world!!!";
    }

    @GetMapping("add")
    public Long getAndAdd() {
        return getAndSetService.getAndSet();
    }
}
