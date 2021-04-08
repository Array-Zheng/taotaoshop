package com.taotaoshop.system.service.impl;

import com.taotaoshop.common.core.domain.entity.User;
import com.taotaoshop.system.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser() {
        User user = new User();
        user.setAvatar("df");
        user.setEmail("asrstdyfugh");
        return user;
    }
}
