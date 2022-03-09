package com.Pluto.E_Commerce_Platform.dao;

import com.Pluto.E_Commerce_Platform.entity.IndexImg;
import com.Pluto.E_Commerce_Platform.general.GeneralDao;

import java.util.List;

public interface IndexImgMapper extends GeneralDao<IndexImg> {
    //查询轮播图信息
    List<IndexImg> listIndexImg();
}