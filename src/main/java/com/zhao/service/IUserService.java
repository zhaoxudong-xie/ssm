package com.zhao.service;

import com.zhao.domain.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    List<User> findAll();
}
