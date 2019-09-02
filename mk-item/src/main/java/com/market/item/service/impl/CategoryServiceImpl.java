package com.market.item.service.impl;

import com.market.item.mapper.CategoryMapper;
import com.market.item.model.Category;
import com.market.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/8/30
 * @Version V1.0
 **/
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        return categoryMapper.queryCategoryByPid(pid);
    }

    @Override
    public Category selectByPrimaryKey(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
}
