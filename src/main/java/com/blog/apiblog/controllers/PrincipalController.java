package com.blog.apiblog.controllers;

import com.blog.apiblog.dto.BlogDTO;
import com.blog.apiblog.entities.Blog;
import com.blog.apiblog.service.BlogServiceImpl;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PrincipalController {

    private final BlogServiceImpl blogService;


    @GetMapping("/blog")
    public ResponseEntity<?> getAllBlog(){
        List<Blog> blogs = blogService.getAllBlog();
        return ResponseEntity.ok(blogs);
    }

    @GetMapping("/bloglazy")
    public ResponseEntity<?> getAllBlogLazy(){
        List<BlogDTO> blogs = blogService.getAllBlogLazy();
        return ResponseEntity.ok(blogs);
    }

}
