package com.pluto;

import com.Pluto.E_Commerce_Platform.dao.CategoryMapper;
import com.Pluto.E_Commerce_Platform.entity.Category;
import com.Pluto.E_Commerce_Platform.entity.CategoryVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
class ApiApplicationTests {
    @Resource
    private CategoryMapper categoryMapper;

    @Test
    void contextLoads() {

    }
}

