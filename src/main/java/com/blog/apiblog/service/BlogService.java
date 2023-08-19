package com.blog.apiblog.service;

import com.blog.apiblog.dto.BlogDTO;
import com.blog.apiblog.entities.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BlogService {

    List<Blog> getAllBlog();

    List<BlogDTO> getAllBlogLazy();
    Blog saveBlog(Blog blog);

    Blog updateBlog(Blog blog);

    void deleteBlog(Long id);
}
