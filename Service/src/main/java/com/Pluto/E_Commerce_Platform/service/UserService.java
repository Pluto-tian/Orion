package com.Pluto.E_Commerce_Platform.service;

import com.Pluto.E_Commerce_Platform.vo.ResultOV;

/**
 * @author Hoaer
 * @version 1.0
 */
public interface UserService {
    //用户注册
    public ResultOV userRegister(String username, String password);

    //用户登录
    public ResultOV checkLogin(String username, String password);
}
