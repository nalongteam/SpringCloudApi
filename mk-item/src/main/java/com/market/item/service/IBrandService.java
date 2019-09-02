package com.market.item.service;

import com.market.common.PageResult;
import com.market.item.model.Brand;

public interface IBrandService {
    PageResult<Brand> queryBrandByPageAndSort(Integer pageNum, Integer pageSize, String sortBy, Boolean desc, String key);
}
