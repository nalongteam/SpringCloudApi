package com.market.item.service;

import com.market.item.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> queryCategoryByPid(Long pid);

    Category selectByPrimaryKey(Long id);
}
