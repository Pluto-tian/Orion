package com.pluto.controller;

import com.Pluto.E_Commerce_Platform.vo.ResStaus;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hoaer
 * @version 1.0
 */
@RestController
@RequestMapping("/shopcart")
@Api(value = "", tags = "购物车")
@CrossOrigin
public class ShopcartController {
    @GetMapping("/list")
    public ResultOV listCarts() {
        return new ResultOV(ResStaus.OK,"success","list");
    }
}
