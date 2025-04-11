package com.hello_world.springAtt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hello_world.springAtt1")
public class SpringAtt1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringAtt1Application.class, args);
    }
}