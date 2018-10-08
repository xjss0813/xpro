package com.sean.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yahui, xie
 * @create 2018-10-08
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return "Hello Spring Boot!!";
    }
}
