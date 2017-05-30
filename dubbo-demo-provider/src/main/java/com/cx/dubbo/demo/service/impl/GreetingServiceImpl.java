package com.cx.dubbo.demo.service.impl;

import com.cx.dubbo.demo.service.GreetingService;

import java.util.Date;

/**
 * Created by cx on 2017/5/30.
 */
public class GreetingServiceImpl implements GreetingService {
    public String hello(String name) {
        System.out.println("Hello Service is calling : " + new Date());
        String greetMessage = "Hello, " + name;
        return greetMessage;
    }
}
