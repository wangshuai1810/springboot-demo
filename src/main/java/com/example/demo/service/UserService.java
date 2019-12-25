package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserEntity findById(long id) {
        UserEntity userEntity = new UserEntity(id, "张三", "小张");

        logger.info("find user message:{} from read db by id:{}", userEntity, id);

        return userEntity;
    }
}
