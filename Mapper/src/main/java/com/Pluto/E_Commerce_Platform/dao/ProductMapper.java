package com.Pluto.E_Commerce_Platform.dao;

import com.Pluto.E_Commerce_Platform.entity.Product;
import com.Pluto.E_Commerce_Platform.entity.ProductVO;
import com.Pluto.E_Commerce_Platform.general.GeneralDao;

import java.util.List;

public interface ProductMapper extends GeneralDao<Product> {

    List<ProductVO> selectRecommendProducts();
}