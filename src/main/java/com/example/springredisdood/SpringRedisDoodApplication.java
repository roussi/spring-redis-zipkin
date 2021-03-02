package com.example.springredisdood;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRedisDoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisDoodApplication.class, args);
    }
}
