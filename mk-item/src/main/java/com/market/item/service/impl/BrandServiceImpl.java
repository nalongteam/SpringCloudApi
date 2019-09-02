package com.market.item.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.market.common.PageResult;
import com.market.item.dto.requests.BrandRequest;
import com.market.item.mapper.BrandMapper;
import com.market.item.model.Brand;
import com.market.item.service.IBrandService;
import com.market.utils.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageResult<Brand> queryBrandByPageAndSort(Integer pageNum, Integer pageSize, String sortBy, Boolean desc, String key) {
        PageResult<Brand> data=new PageResult<Brand>();
        // 开始分页
        Page page= PageHelper.startPage(pageNum, pageSize,true);

        BrandRequest brandRequest=new BrandRequest();
        if (!StringHelper.IsNullOrEmpety(sortBy)){
            String sort=desc?"DESC":"ASC";
            PageHelper.orderBy(sortBy+" "+sort);
        }

        if (!StringHelper.IsNullOrEmpety(key)){
            brandRequest.setQueryKey(key);
        }

        List<Brand> items= brandMapper.queryBrandByPageAndSort(brandRequest);

        data.setTotal(page.getTotal());
        data.setTotalPage(Long.valueOf(page.getPages()));
        data.setItems(items);

        return data;
    }
}
