package com.example.caffienedemo;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class CaffieneDemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(CaffieneDemoApplication.class, args);
    }

}
