package com.zhao.service;

import com.zhao.domain.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    List<User> findAll();
    void delete(Integer id);
    User findById(Integer id);
    void update(User user);
}
