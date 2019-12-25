package com.example.demo.cache;

import com.example.demo.ApplicationTest;
import com.example.demo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserCacheTest extends ApplicationTest {

    @Autowired
    private UserCache userCache;

    @Test
    void findById() {
        long id = 10L;

        UserEntity byId = userCache.findById(id);

        System.out.println(byId);

        UserEntity byId1 = userCache.findById(id);

        System.out.println(byId1);
    }

    @Test
    public void deleteById(){
        long id = 10L;

        System.out.println("select user message first ...");
        UserEntity byId = userCache.findById(id);

        System.out.println(byId);

        System.out.println("delete user message");
        userCache.deleteById(id);

        System.out.println("第二次查询 ...");
        UserEntity byId1 = userCache.findById(id);
        System.out.println(byId1);

        System.out.println("select user message three ...");
        UserEntity byId2 = userCache.findById(id);
        System.out.println(byId2);
    }
}