package com.cwj.music.service.impl;

import com.cwj.music.dao.UserDao;
import com.cwj.music.entity.User;
import com.cwj.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public int queryUserByNumber(String number) {
        return userDao.queryUserByNumber(number);
    }


    @Override
    public boolean updateUserById() {
        return false;
    }

    @Override
    public boolean deleteUserById() {
        return false;
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public User userLogin(String number) {
        User user = userDao.userLogin(number);
        return user;
    }

    @Override
    public int userReg(User user){
        return userDao.userReg(user);
    }
}
