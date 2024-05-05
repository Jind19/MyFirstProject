package com.prachi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    private int age;

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public Developer(){
        System.out.println("Developer object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Developer is coding");
        com.compile();
    }
}
