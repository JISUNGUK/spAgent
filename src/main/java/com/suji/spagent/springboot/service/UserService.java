package com.suji.spagent.springboot.service;

import com.suji.spagent.springboot.dao.UserDao;
import com.suji.spagent.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public User getUserByUserId(String userId){
        return userDao.getUserById(userId);
    }

    public User registerUser(User user){
        return userDao.insertUser(user);
    }

    public void modifyUser(String userId, User user){
        userDao.UpdateUser(userId, user);
    }

    public void removeUser(String userId){
        userDao.deleteUser(userId);
    }
}