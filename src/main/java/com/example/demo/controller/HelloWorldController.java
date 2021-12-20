package com.example.demo.controller;

import com.example.demo.service.GetAndSetService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

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
    public String helloAliyun(@RequestParam("reason") String reason) {
        return reason;
    }

    @GetMapping("add")
    public Long getAndAdd() {
        return getAndSetService.getAndSet();
    }

    @GetMapping("date")
    public LocalDate getAndAdd(@RequestParam @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate performanceDate) {
        return performanceDate;
    }


}
