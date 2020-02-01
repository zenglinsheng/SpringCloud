package com.imooc.order.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class MyConfig {

    @Value("${env}")
    private String env;

    @Value("${girl.name}")
    private String name;

    @Value("${girl.age}")
    private Integer age;

}
