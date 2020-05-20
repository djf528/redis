package com.example.eurekafeigndemo.mapper;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断机制Feign是自带断路器的，在D版本的Spring Cloud之后，它没有默认打开。需要在配置文件中配置打开它，在配置文件加以下代码：feign.hystrix.enabled=true
 * 只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了：
 * @author 86159
 * 通过@FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口，代码如下：
 */
@FeignClient(value = "service-hi",fallback = testFegin.class)
public interface testFegin {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
