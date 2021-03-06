package com.cccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Zhai
 * 2020/5/20 21:59
 */
@EnableDiscoveryClient
@SpringBootApplication
public class StreamMqApplication8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqApplication8802.class, args);
    }
}
