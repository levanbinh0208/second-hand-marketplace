package com.marketplace.service;

import com.marketplace.domain.User;
import com.marketplace.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getById(Long id) {
        return userMapper.findById(id);
    }

    public User getByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    public List<User> getAll() {
        return userMapper.findAll();
    }

    public void create(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}