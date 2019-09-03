package com.market.item.service.impl;

import com.market.item.mapper.SpecificationMapper;
import com.market.item.model.Specification;
import com.market.item.service.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SpecificationService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/3
 * @Version V1.0
 **/
@Service
public class SpecificationService implements ISpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;

    public Specification querySpecificationByCategoryId(Long id){
       return specificationMapper.selectByPrimaryKey(id);
    }
}
