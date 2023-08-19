package com.blog.apiblog.service;

import com.blog.apiblog.dto.BlogDTO;
import com.blog.apiblog.entities.Blog;
import com.blog.apiblog.repositories.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService{


    private final BlogRepository blogRepository;


    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public List<BlogDTO> getAllBlogLazy() {
        return blogRepository.findAll().stream().map(b ->
            new BlogDTO(b.getId(), b.getDescription(), b.getImage(), b.getPostedAt(), b.getUser().getId())
        ).collect(Collectors.toList());
    }
    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
