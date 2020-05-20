package com.example.eurekafeigndemo.Controller;


import com.example.eurekafeigndemo.mapper.testFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testFeginController {
    @Autowired
    testFegin testFegin1;
    @GetMapping(value="/hi")
    public String sayHi(String name){


        // ceshi
        return testFegin1.sayHiFromClientOne(name);
    }

}
