package com.example.eurekaribbondemo.Controller;

import com.example.eurekaribbondemo.Service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    helloService hiService;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return hiService.hiService(name);
    }


}
