package com.cwj.music.dao;

import com.cwj.music.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int deleteUserById(Integer id);
    int addUser(User user);
    int updateUser(User user);
    User queryById(Integer id);
    List<User> queryUserList();
    User userLogin(String number);
    int userReg(User user);
    int queryUserByNumber(String number);
}
