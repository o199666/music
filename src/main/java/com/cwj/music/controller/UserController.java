package com.cwj.music.controller;

import com.cwj.music.Utils.ResultUtil;
import com.cwj.music.entity.Result;
import com.cwj.music.entity.User;
import com.cwj.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    ResultUtil resultUtil = new ResultUtil();

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Result queryUserList() {
        return resultUtil.success(userService.queryUserList());
    }



    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(String name, String age) {
        User user = new User();
        userService.addUser(user);
    }




    @PostMapping(value = "/userLogin/{number}/{pwd}")
    public Result userLogin(@PathVariable("number") String number, @PathVariable("pwd") String pwd) {
        if (number.length() == 0 || pwd.length() == 0) {
            User u = userService.userLogin(number);
            if (u != null) {
                if (u.getNumber() == null) {
                    return resultUtil.success("账号不存在");
                } else if (!u.getPassword().equals(pwd)) {
                    return resultUtil.success("密码错误");
                }
            }
            return resultUtil.success(u);
        } else {
            return resultUtil.success("请输入账号和密码！");

        }

    }


    @PostMapping(value = "/userReg")
    public Result userReg(@RequestBody User user) {
      //todo先查询一下。判断有无已经注册
      int result=userService.queryUserByNumber(user.getNumber());
      if (result==1){//chaxuncheng
          return resultUtil.success("注册失败,用户名已存在!");
      }else{
          int us= userService.userReg(user);
          System.out.println(user.toString());
          if (us==1){
              return resultUtil.success("注册成功");
          }
      }
        return resultUtil.success("注册失败");
    }
}
