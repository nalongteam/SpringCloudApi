package com.market.item.mapper;

import com.market.item.dto.requests.BrandRequest;
import com.market.item.model.Brand;

import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    List<Brand> queryBrandByPageAndSort(BrandRequest request);
}