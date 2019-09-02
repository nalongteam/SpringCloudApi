package com.market.item.mapper;

import com.market.item.model.CategoryBrandKey;

public interface CategoryBrandMapper {
    int deleteByPrimaryKey(CategoryBrandKey key);

    int insert(CategoryBrandKey record);

    int insertSelective(CategoryBrandKey record);
}