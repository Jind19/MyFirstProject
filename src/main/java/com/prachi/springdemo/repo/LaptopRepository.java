package com.prachi.springdemo.repo;

import com.prachi.springdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved in Database");

    }
}
