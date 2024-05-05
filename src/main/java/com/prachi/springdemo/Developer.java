package com.prachi.springdemo;

public class Developer {

    private int age;
    private String name;
    private Laptop lap;

    public Developer(){
        System.out.println("Developer object created");
    }

    public Developer(int age, Laptop lap, String name){
        System.out.println("Para constructor laptop called");
        this.age = age;
        this.lap = lap;
        this.name = name;

    }

    public Developer(int age, String name){
        System.out.println("Para constructor name called");
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name setter called");
        this.name = name;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("laptop setter called");
        this.lap = lap;
    }

    public void code(){
        System.out.println("Developer is coding");
        lap.compile();
    }
}
