package com.example.eurekafeigndemo.Service;

import org.springframework.stereotype.Component;

@Component
public class TestHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
