package com.Pluto.E_Commerce_Platform.service.impl;

import com.Pluto.E_Commerce_Platform.dao.UsersMapper;
import com.Pluto.E_Commerce_Platform.entity.Users;
import com.Pluto.E_Commerce_Platform.utils.MD5Utils;
import com.Pluto.E_Commerce_Platform.vo.ResStaus;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Hoaer
 * @version 1.0
 */
@Service
public class UserServiceImpl implements com.Pluto.E_Commerce_Platform.service.UserService {

    @Resource
    private UsersMapper usersMapper;

    @Transactional
    public ResultOV userRegister(String username, String password) {
        //因为spring默认是单例，所以用this
        synchronized (this) {
            //查询此用户名是否已被注册
            Example example = new Example(Users.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("username", username);
            List<Users> users = usersMapper.selectByExample(example);
            System.out.println(users);
            //没查询到
            if (users.size() == 0) {
                String md5password = MD5Utils.md5(password);
                Users user = new Users();
                user.setUsername(username);
                user.setPassword(md5password);
                user.setUserImg("img/default.png");
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int i = usersMapper.insert(user);
                if (i > 0) {
                    return new ResultOV(ResStaus.OK, "注册成功", user);
                } else {
                    return new ResultOV(ResStaus.NO, "注册失败", null);
                }
            } else {
                return new ResultOV(ResStaus.NO, "用户名已被注册", null);
            }
        }
    }

    @Override
    public ResultOV checkLogin(String username, String password) {
        //通过用户名查询用户信息
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        List<Users> users = usersMapper.selectByExample(example);
        if (users.size() == 0) {
            return new ResultOV(ResStaus.NO, "用户名不存在", null);
        } else {
            String md5password = MD5Utils.md5(password);
            assert md5password != null;
            if (md5password.equals(users.get(0).getPassword())) {
                //验证成功,添加令牌
                Map<String, Object> map = new HashMap<>();
                //使用JSON WEB TOKEN生产TOKEN
                JwtBuilder builder = Jwts.builder();
                String token = builder.setSubject(username)//设置token中携带的数据
                        .setIssuedAt(new Date())//设置token创建时间
                        .setId(users.get(0).getUserId() + "")//设置用户id为token id
                        .setClaims(map) //可以存放一些其它的信息例如：用户的权限
                        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))//设置token过期时间为1天
                        .signWith(SignatureAlgorithm.HS256, "IntelliJ IDEA 2021.3.1")//设置加密方式和加密密码
                        .compact();
                return new ResultOV(ResStaus.OK, token, users.get(0));
            } else {
                return new ResultOV(ResStaus.NO, "密码错误", null);
            }
        }
    }

}
