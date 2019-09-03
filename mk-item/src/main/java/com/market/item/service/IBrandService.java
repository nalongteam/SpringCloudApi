package com.market.item.service;

import com.market.common.PageResult;
import com.market.item.model.Brand;

import java.util.List;

public interface IBrandService {
    PageResult<Brand> queryBrandByPageAndSort(Integer pageNum, Integer pageSize, String sortBy, Boolean desc, String key);

    int insert(Brand record);

    void saveBrand(Brand brand, List<Long> cids);
}
