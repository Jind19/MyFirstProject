package com.prachi.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootApplicationDemo {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootApplicationDemo.class, args);

        Developer obj = context.getBean(Developer.class);
        System.out.println(obj.getAge());
        obj.code();
    }
}
