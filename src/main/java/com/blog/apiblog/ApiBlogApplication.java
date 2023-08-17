package com.blog.apiblog;

import com.blog.apiblog.entities.User;
import com.blog.apiblog.service.BlogServiceImpl;
import com.blog.apiblog.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiBlogApplication {



    public static void main(String[] args) {
        SpringApplication.run(ApiBlogApplication.class, args);
    }


    private final UserServiceImpl userService;
    private final BlogServiceImpl blogService;

    @Bean
    CommandLineRunner init (){
        return args -> {
            User user = User.builder()
                    .username("user1")
                    .name("name1")
                    .lastname("lastname1")
                    .build();

            User user2 = User.builder()
                    .username("user2")
                    .name("name2")
                    .lastname("lastname2")
                    .build();

            User user3 = User.builder()
                    .username("user3")
                    .name("name3")
                    .lastname("lastname3")
                    .build();

            userService.saveUser(user);
            userService.saveUser(user2);
            userService.saveUser(user3);

        };
    }

}
