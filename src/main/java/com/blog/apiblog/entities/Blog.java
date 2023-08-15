package com.blog.apiblog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Blog {

    //TODO: test entity blog and user

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String image;
    @Column(name = "posted_at")
    private LocalDate postedAt;

    @ManyToOne()
    @JoinColumn(name = "use_id")
    private User user;


}
