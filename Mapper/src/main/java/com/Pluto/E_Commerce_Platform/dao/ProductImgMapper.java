package com.Pluto.E_Commerce_Platform.dao;

import com.Pluto.E_Commerce_Platform.entity.ProductImg;
import com.Pluto.E_Commerce_Platform.general.GeneralDao;

import java.util.List;

public interface ProductImgMapper extends GeneralDao<ProductImg> {
    List<ProductImg> selectProductImg(int produceId);
}