package com.cx.dubbo.demo.main;

import com.cx.dubbo.demo.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by cx on 2017/5/30.
 */
public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        String greetMessage = greetingService.hello("Eric");
        System.out.println("Consumer ==> " + greetMessage);
        context.destroy();
    }
}
