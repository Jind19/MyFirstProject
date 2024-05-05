package com.prachi.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  //creates Container

        Developer obj = (Developer) context.getBean("developer1");
        obj.code();

        Developer obj1 = (Developer) context.getBean("developer1");
        obj1.code();
    }
}
