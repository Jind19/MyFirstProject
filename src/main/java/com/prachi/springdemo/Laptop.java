package com.prachi.springdemo;

import org.springframework.stereotype.Component;

    @Component
    public class Laptop implements Computer{
        public void compile(){
            System.out.println("Compiling using laptop");
        }
    }

