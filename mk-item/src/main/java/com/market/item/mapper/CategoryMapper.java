package com.market.item.mapper;

import com.market.item.model.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> queryCategoryByBid(Long bid);

    List<Category> queryCategoryByPid(Long pid);
}