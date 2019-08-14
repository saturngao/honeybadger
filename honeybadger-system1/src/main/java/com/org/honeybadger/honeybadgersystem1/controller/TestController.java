package com.org.honeybadger.honeybadgersystem1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.org.honeybadger.honeybadgersystem1.controller
 * Description：
 * Date: Created in 2019/8/2 16:02
 * Company: haier
 */

@RefreshScope
@RestController
public class TestController {

    @Value("${testyangqi.name}")
    private String userName;

    @Value("${testyangqi.age}")
    private  String  age;

    @Value("${testyangqi.sex}")
    private String sex;


    @GetMapping("/test")
    public String firstTest(){
        return "hello nacos"+"username="+userName+"age="+age+"sex="+sex;
    }


    public static void main(String[] args) {

    }
}
