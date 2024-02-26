package com.shopping.shoppingApp.service;

import com.shopping.shoppingApp.Dao.UserDao;
import com.shopping.shoppingApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(Integer userId) {
        Optional<User> userOptional = userDao.findById(userId);
        return userOptional.orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    @Override
    public User addUser(User userDetails) {
        if (userDao.existsById(userDetails.getUserId())) {
            throw new RuntimeException("User already exists, please try to update the details");
        }
        return userDao.save(userDetails);
    }

    @Override
    public User updateUser(User userDetails) {
        getUser(userDetails.getUserId()); // Check if user exists
        return userDao.save(userDetails);
    }

    @Override
    public User deleteUser(Integer userId) {
        User user = getUser(userId); // Check if user exists
        userDao.delete(user);
        return user;
    }
}
