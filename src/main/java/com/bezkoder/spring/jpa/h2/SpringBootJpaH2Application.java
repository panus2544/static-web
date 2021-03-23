package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.bezkoder.spring.jpa.h2" })
public class SpringBootJpaH2Application {

    public static void main(final String[] args) {
        SpringApplication.run(SpringBootJpaH2Application.class, args);
    }

}
