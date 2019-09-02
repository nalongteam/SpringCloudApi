package com.market.item.dto.requests;

import lombok.Data;

/**
 * @ClassName BrandRequest
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Data
public class BrandRequest {
    public String sortByField;

    public String sort;

    public String queryKey;
}
