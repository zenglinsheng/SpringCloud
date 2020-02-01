package com.imooc.order.controller;

import com.imooc.order.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2018-01-21 21:57
 */
@RestController
@RequestMapping("/env")
public class EnvController {

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/print")
    private String print() {
        return myConfig.getEnv()+" "+myConfig.getName()+" "+myConfig.getAge();
    }
}
