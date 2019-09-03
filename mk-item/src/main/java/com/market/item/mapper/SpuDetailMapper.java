package com.market.item.mapper;

import com.market.item.model.SpuDetail;

public interface SpuDetailMapper {
    int deleteByPrimaryKey(Long spuId);

    int insert(SpuDetail record);

    int insertSelective(SpuDetail record);

    SpuDetail selectByPrimaryKey(Long spuId);

    int updateByPrimaryKeySelective(SpuDetail record);

    int updateByPrimaryKeyWithBLOBs(SpuDetail record);

    int updateByPrimaryKey(SpuDetail record);
}