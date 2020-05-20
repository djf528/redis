package com.example.eurekafeigndemo.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author 86159
 * FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了
 */
@FeignClient(value = "service-hi",fallback = TestHystrix.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
