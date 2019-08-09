package com.org.honeybadger.honeybadgersystem2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Package: com.org.honeybadger.honeybadgersystem2.controller
 * Description：
 * Date: Created in 2019/8/2 16:09
 * Company: haier
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/nacos/test")
    public String firstTest(){
      return restTemplate.getForObject("http://springcloud-nacos-discovery-provider/test/", String.class);
    }


    @GetMapping("/nacos/second")
    public String secondTest(){
        return restTemplate.getForObject("http://springcloud-nacos-discovery-consumer/nacos/test/", String.class);
    }




}
