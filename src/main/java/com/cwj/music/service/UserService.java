package com.cwj.music.service;

import com.cwj.music.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Repository
public interface UserService {
    void addUser(User user);
    int queryUserByNumber(String number);
    boolean updateUserById();
    boolean deleteUserById();
    List<User> queryUserList();
    User userLogin(String number);
    int userReg(User user);

}
