package com.example.eurekaribbondemo.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class helloService {
    @Autowired
    RestTemplate restTemplate;
    //在hiService方法上加上@HystrixCommand注解。
    // 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    @HystrixCommand(commandKey = "hierroer")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

   public  String hierroer(String name){
        return  "hi,"+name+",sorry,error!";
   }

}
