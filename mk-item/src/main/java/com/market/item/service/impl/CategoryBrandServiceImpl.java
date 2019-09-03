package com.market.item.service.impl;

import com.market.item.mapper.CategoryBrandMapper;
import com.market.item.model.CategoryBrandKey;
import com.market.item.service.ICategoryBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CategoryBrandService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Service
public class CategoryBrandServiceImpl implements ICategoryBrandService {
   @Autowired
    private CategoryBrandMapper categoryBrandMapper;

    @Override
    public int insert(CategoryBrandKey record) {
        return categoryBrandMapper.insert(record);
    }
}
