package com.market.item.mapper;

import com.market.item.model.Spu;

public interface SpuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Spu record);

    int insertSelective(Spu record);

    Spu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKey(Spu record);
}