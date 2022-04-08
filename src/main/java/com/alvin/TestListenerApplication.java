package com.alvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.alvin")
public class TestListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestListenerApplication.class, args);
    }

}
