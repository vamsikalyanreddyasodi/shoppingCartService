package com.shopping.shoppingApp.service;

import com.shopping.shoppingApp.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User getUser(Integer userId);
    public User addUser(User newUser);
    public User updateUser(User userDetails);
    public User deleteUser(Integer userId);
}
