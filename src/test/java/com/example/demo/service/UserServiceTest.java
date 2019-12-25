package com.example.demo.service;

import com.example.demo.ApplicationTest;
import com.example.demo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserServiceTest extends ApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    void findById() {
        long id = 10L;
        UserEntity byId = userService.findById(id);

        UserEntity byId1 = userService.findById(id);

    }
}