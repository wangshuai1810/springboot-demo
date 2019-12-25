package com.example.demo.cache;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
@EnableCaching
public class UserCache {

    private static final Logger logger = LoggerFactory.getLogger(UserCache.class);

    @Autowired
    private UserService userService;

    @Cacheable(value = "userInfo")
    public UserEntity findById(long id) {

        UserEntity byId = userService.findById(id);

        // logger.info("find cache user message:{}, by id: {}", byId, id);

        return byId;
    }

    @CacheEvict(value = "userInfo", beforeInvocation = true, allEntries = true)
    public void deleteById(long id) {
        logger.info("delete userInfo cache success  ...");
    }
}
