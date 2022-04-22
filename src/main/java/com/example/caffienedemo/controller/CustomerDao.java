package com.example.caffienedemo.controller;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CustomerDao {

    @Cacheable("customers")
    public String getCustomerById(String id) throws Exception {
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
            throw new Exception("Oh noes!");
        }
        return "Peter the Great with ID: " + id;
    }
}
