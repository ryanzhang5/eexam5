package com.sincosys.service.impl;

import com.sincosys.dao.UserDao;
import com.sincosys.model.User;
import com.sincosys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User getById(int userId) {
        return userDao.getById(userId);
    }
}
