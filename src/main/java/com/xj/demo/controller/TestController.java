package com.xj.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试Apollo
 * @author: xijie
 * @dte: 2022/7/12
 */
@RestController
@RequestMapping("apollo")
public class TestController {

    @Value("${testName}")
    private String testName;

    @GetMapping
    public String get(){
       return testName;
    }
}
