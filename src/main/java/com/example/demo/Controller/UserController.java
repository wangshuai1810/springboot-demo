package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping(value = "/user/{id}")
    public Object findUserInfo(@PathVariable(value = "id") String userId) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put(userId, "1");
        resultMap.put("userName", "张三");

        return resultMap;
    }
}
