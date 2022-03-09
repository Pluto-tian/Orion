package com.pluto.controller;

import com.Pluto.E_Commerce_Platform.service.impl.IndexServiceImpl;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Hoaer
 * @version 1.0
 */
@RestController
@CrossOrigin
@Api(value ="轮播图,分类列表", tags ="首页")
@RequestMapping("/index")
public class IndexController {

    @Resource
    private IndexServiceImpl indexService;

    @GetMapping("/indeximg")
    public ResultOV listImage() {
        return indexService.listIndexImages();
    }

    @GetMapping("/listcategory")
    public ResultOV listCategory(){
        return indexService.listCategory();
    }
    @GetMapping("/listproduct")
    public ResultOV listRecommendProducts(){
        return indexService.listRecommendProductes();
    }
}
