package com.blog.apiblog;

import com.blog.apiblog.entities.Blog;
import com.blog.apiblog.entities.User;
import com.blog.apiblog.service.BlogServiceImpl;
import com.blog.apiblog.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiBlogApplication {


    private final UserServiceImpl userService;
    private final BlogServiceImpl blogService;


    public static void main(String[] args) {
        SpringApplication.run(ApiBlogApplication.class, args);
    }


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

            Blog blog = Blog.builder()
                    .description("blog1")
                    .image("image1")
                    .user(user)
                    .build();

            Blog blog2 = Blog.builder()
                    .description("blog1")
                    .image("image1")
                    .user(user)
                    .build();

            Blog blog3 = Blog.builder()
                    .description("blog1")
                    .image("image1")
                    .user(user2)
                    .build();

            blogService.saveBlog(blog);
            blogService.saveBlog(blog2);
            blogService.saveBlog(blog3);

//            List<Blog> blogs = blogService.getAllBlog();
//
//            //blogs.forEach(System.out::println);
//
//            List<Blog> lastnames = blogs.stream().filter(b -> b.getUser().getLastname().endsWith("2"))
//                    .collect(Collectors.toList());
//
//
//            lastnames.forEach(System.out::println);


        };
    }

}
