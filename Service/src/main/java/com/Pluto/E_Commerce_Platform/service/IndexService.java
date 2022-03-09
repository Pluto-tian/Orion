package com.Pluto.E_Commerce_Platform.service;

import com.Pluto.E_Commerce_Platform.vo.ResultOV;
/**
 * @author Hoaer
 * @version 1.0
 */
public interface IndexService {
    ResultOV listIndexImages();
    ResultOV listCategory();
    ResultOV listRecommendProductes();
}
