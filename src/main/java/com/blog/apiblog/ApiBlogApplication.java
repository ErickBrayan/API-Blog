package com.blog.apiblog;

import com.blog.apiblog.service.BlogServiceImpl;
import com.blog.apiblog.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiBlogApplication {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    BlogServiceImpl blogService;

    public static void main(String[] args) {
        SpringApplication.run(ApiBlogApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (){
        return args -> {



        };
    }

}
