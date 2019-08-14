package com.org.honeybadger.honeybadgersystem1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HoneybadgerSystem1Application {

    public static void main(String[] args) {
        SpringApplication.run(HoneybadgerSystem1Application.class, args);
    }
}
