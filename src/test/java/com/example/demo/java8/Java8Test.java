package com.example.demo.java8;

import org.junit.Test;

import java.util.Optional;

public class Java8Test {

    @Test
    public void testOptional(){
        System.out.println(getUserNameByOptional(null));
    }

    private static String getUserNameByOptional(UserEntity userEntity){
        return Optional.ofNullable(userEntity).map(UserEntity::getName).orElse("unknown");
    }
}
