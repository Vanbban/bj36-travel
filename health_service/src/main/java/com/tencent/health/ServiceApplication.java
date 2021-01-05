package com.tencent.health;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: Vanbban
 * @create 2021-01-05 23:56
 */
public class ServiceApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        System.in.read();
    }
}
