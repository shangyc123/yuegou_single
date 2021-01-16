package com.zr.yuegou_single.service;


import com.zr.yuegou_single.dto.ResultBean;
import com.zr.yuegou_single.pojo.User;

public interface UserService {
    //根据传入的用户，做登陆验证，返回一个用户对象
    User checkLogin(User user);

    ResultBean checkIsLogin(String uuid);

    ResultBean logout(String uuid);
}
