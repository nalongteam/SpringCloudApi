package com.market.item.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.market.common.PageResult;
import com.market.item.dto.requests.BrandRequest;
import com.market.item.mapper.BrandMapper;
import com.market.item.mapper.CategoryBrandMapper;
import com.market.item.model.Brand;
import com.market.item.model.CategoryBrandKey;
import com.market.item.service.IBrandService;
import org.apache.commons.lang.StringUtils;
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
    @Autowired
    private CategoryBrandMapper categoryBrandMapper;

    @Override
    public PageResult<Brand> queryBrandByPageAndSort(Integer pageNum, Integer pageSize, String sortBy, Boolean desc, String key) {
        PageResult<Brand> data=new PageResult<Brand>();
        // 开始分页
        Page page= PageHelper.startPage(pageNum, pageSize,true);

        BrandRequest brandRequest=new BrandRequest();
        if (!StringUtils.isBlank(sortBy)){
            String sort=desc?"DESC":"ASC";
            PageHelper.orderBy(sortBy+" "+sort);
        }

        if (!StringUtils.isBlank(key)){
            brandRequest.setQueryKey(key);
        }

        List<Brand> items= brandMapper.queryBrandByPageAndSort(brandRequest);

        data.setTotal(page.getTotal());
        data.setTotalPage(Long.valueOf(page.getPages()));
        data.setItems(items);

        return data;
    }

    @Override
    public int insert(Brand record) {
        return brandMapper.insert(record);
    }

    @Override
    public void saveBrand(Brand brand, List<Long> cids) {
        brandMapper.insert(brand);
        for (Long cid:cids) {
            CategoryBrandKey categoryBrandKey=new CategoryBrandKey();
            categoryBrandKey.setBrandId(brand.getId());
            categoryBrandKey.setCategoryId(cid);
            categoryBrandMapper.insert(categoryBrandKey);
        }
    }
}
