package com.taotaoshop.web.controller;

import com.taotaoshop.common.core.domain.entity.User;
import com.taotaoshop.system.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }
}
