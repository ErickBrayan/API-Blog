package com.blog.apiblog.service;


import com.blog.apiblog.entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    User saveUser(User user);
    User updateUser(User use);
    void deleteUser(Long id);


}
