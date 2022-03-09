package com.Pluto.E_Commerce_Platform.dao;

import com.Pluto.E_Commerce_Platform.entity.Category;
import com.Pluto.E_Commerce_Platform.entity.CategoryVO;
import com.Pluto.E_Commerce_Platform.general.GeneralDao;

import java.util.List;

public interface CategoryMapper extends GeneralDao<Category> {
    List<CategoryVO> selecrAllCaetgories(int parentId);
}