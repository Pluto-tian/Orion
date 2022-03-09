package com.Pluto.E_Commerce_Platform.service.impl;

import com.Pluto.E_Commerce_Platform.dao.CategoryMapper;
import com.Pluto.E_Commerce_Platform.dao.IndexImgMapper;
import com.Pluto.E_Commerce_Platform.dao.ProductMapper;
import com.Pluto.E_Commerce_Platform.entity.CategoryVO;
import com.Pluto.E_Commerce_Platform.entity.IndexImg;
import com.Pluto.E_Commerce_Platform.entity.ProductVO;
import com.Pluto.E_Commerce_Platform.service.IndexService;
import com.Pluto.E_Commerce_Platform.vo.ResStaus;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private IndexImgMapper indexImgMapper;
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    //index轮播图
    public ResultOV listIndexImages() {
        //从redis查询轮播图信息
        List<IndexImg> indexImgList;
        try {
            //查询redis
            String ImgsStr = stringRedisTemplate.opsForValue().get("indexImgs");
            if (ImgsStr != null) {
                //获取redis中的数据，并转类型返回给前端
                JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, IndexImg.class);
                indexImgList = objectMapper.readValue(ImgsStr, javaType);
                return new ResultOV(ResStaus.OK, "success", indexImgList);
            } else {
                //当大量的并发请求，加线程锁使他们串行
                synchronized (this) {
                    //再查询redis
                    String data = stringRedisTemplate.opsForValue().get("indexImgs");
                    //如果它是多个并发中的第一个，那么他从redis中查到的数据为空，
                    if(data == null){
                        //查询数据库
                        indexImgList = indexImgMapper.listIndexImg();
                        if (indexImgList.size() != 0) {
                            //判断查询的数据，并且写进redis，再返回给前端
                            String imgStr = objectMapper.writeValueAsString(indexImgList);
                            stringRedisTemplate.boundValueOps("indexImgs").set(imgStr);
                            return new ResultOV(ResStaus.OK, "success", indexImgList);
                        }else {
                            return new ResultOV(ResStaus.NO, "fail", null);
                        }
                    }else{
                        //如果是第一个后面的就会从redis中查到数据
                        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, IndexImg.class);
                        indexImgList = objectMapper.readValue(data, javaType);
                        return new ResultOV(ResStaus.OK, "success", indexImgList);
                    }
                }
            }
        } catch (JacksonException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultOV listCategory() {
        List<CategoryVO> categoryVOS = categoryMapper.selecrAllCaetgories(0);
        return new ResultOV(ResStaus.OK, "success", categoryVOS);
    }

    public ResultOV listRecommendProductes() {
        List<ProductVO> productList = productMapper.selectRecommendProducts();
        return new ResultOV(ResStaus.OK, "success", productList);
    }
}
