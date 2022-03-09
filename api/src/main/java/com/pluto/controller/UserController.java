package com.pluto.controller;

import com.Pluto.E_Commerce_Platform.entity.Users;
import com.Pluto.E_Commerce_Platform.service.UserService;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Hoaer
 * @version 1.0
 * dataType:参数类型
 * name:参数名称
 * value:参数说明
 * required:是否为必填项
 * defaultValue:非必填项默认值
 */

@RestController
@RequestMapping("/user")
@Api(value = "用户注册，登录", tags = "用户管理")
@CrossOrigin
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/register")
    @ApiOperation("用户注册接口")
    public ResultOV register(@RequestBody Users user) {
        return userService.userRegister(user.getUsername(), user.getPassword());
    }

    @GetMapping("/login")
    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "密码", required = true)
    })
    public ResultOV login(@RequestParam String username, @RequestParam String password) {
        return userService.checkLogin(username, password);
    }

}
