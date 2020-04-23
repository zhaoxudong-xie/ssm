package com.zhao.service.Impl;

import com.zhao.dao.IUserDao;
import com.zhao.domain.User;
import com.zhao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
