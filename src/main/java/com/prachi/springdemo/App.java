package com.prachi.springdemo;

import com.prachi.springdemo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Developer obj = context.getBean(Developer.class);
        Developer obj1 = context.getBean(Developer.class);
        System.out.println(obj.getAge());
        obj.code();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();
//
//        Desktop dt2 = context.getBean(Desktop.class);
//        dt2.compile();

    }
}
