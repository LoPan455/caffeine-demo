package com.example.caffienedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableCaching
public class DemoController {

    @Autowired CustomerDao customerDao;

    @GetMapping("/customer/{id}")
    @ResponseBody
    String getCustomerById(@PathVariable String id) throws Exception {
        return customerDao.getCustomerById(id);
    }
}
