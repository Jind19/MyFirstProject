package com.prachi.springdemo;

import com.prachi.springdemo.model.Developer;
import com.prachi.springdemo.model.Laptop;
import com.prachi.springdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApplicationDemo {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootApplicationDemo.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

//        Developer obj = context.getBean(Developer.class);
//        System.out.println(obj.getAge());
//        obj.code();
    }
}
