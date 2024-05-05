package com.prachi.springdemo;

public class Developer {

    private int age;
    private Computer com;

    public Developer(){
        System.out.println("Developer object created");
    }
//
//    public Developer(int age, Computer lap, String name){
//        System.out.println("Para constructor laptop called");
//        this.age = age;
//        this.lap = lap;
//        this.name = name;
//
//    }

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
