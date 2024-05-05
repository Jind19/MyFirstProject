package com.prachi.springdemo.config;

import com.prachi.springdemo.Computer;
import com.prachi.springdemo.Desktop;
import com.prachi.springdemo.Developer;
import com.prachi.springdemo.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prachi.springdemo")
public class AppConfig {

//    @Bean
//    public Developer developer(@Qualifier ("laptop") Computer com){
//        Developer obj = new Developer();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean  //(name = {"com1", "desktop1", "beast"})
//    //@Scope(value = "prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
