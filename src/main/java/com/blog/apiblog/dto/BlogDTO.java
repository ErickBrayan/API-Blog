package com.blog.apiblog.dto;

import com.blog.apiblog.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BlogDTO {


    private Long id;
    private String description;
    private String image;
    private LocalDate postedAt;
    private Long user_id;
}
