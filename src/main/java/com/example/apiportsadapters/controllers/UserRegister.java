package com.example.apiportsadapters.controllers;

import com.example.apiportsadapters.core.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(Api.USER)
public class UserRegister {

    @GetMapping(Api.User.REGISTER) // return a response entity
    public ResponseEntity<Map<String, String>> register() {

        final Map<String, String> userInfo = new HashMap<>();

        userInfo.put("name", "John");
        userInfo.put("email", "john@gmail.com");
        userInfo.put("password", "123456");
        userInfo.put("jwt", UUID.randomUUID().toString());

        return ResponseEntity.ok().body(userInfo);
    }

}
