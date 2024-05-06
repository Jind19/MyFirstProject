package com.prachi.springdemo.service;

import com.prachi.springdemo.model.Laptop;
import com.prachi.springdemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        System.out.println("method called");
        repo.save(lap);
    }

    public boolean isGoodforProg(Laptop lap){
        return true;

    }
}
