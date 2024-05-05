package com.prachi.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  //creates Container

        Developer obj = (Developer) context.getBean("developer1");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.code();

        Laptop lappy = (Laptop) context.getBean("laptop");
        lappy.compile();
    }
}
