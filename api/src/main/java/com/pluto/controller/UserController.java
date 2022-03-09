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
 * dataType:��������
 * name:��������
 * value:����˵��
 * required:�Ƿ�Ϊ������
 * defaultValue:�Ǳ�����Ĭ��ֵ
 */

@RestController
@RequestMapping("/user")
@Api(value = "�û�ע�ᣬ��¼", tags = "�û�����")
@CrossOrigin
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/register")
    @ApiOperation("�û�ע��ӿ�")
    public ResultOV register(@RequestBody Users user) {
        return userService.userRegister(user.getUsername(), user.getPassword());
    }

    @GetMapping("/login")
    @ApiOperation("�û���¼�ӿ�")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "�˺�", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "����", required = true)
    })
    public ResultOV login(@RequestParam String username, @RequestParam String password) {
        return userService.checkLogin(username, password);
    }

}
