package com.market.item.service;

import com.market.item.model.Specification;

public interface ISpecificationService {
    Specification querySpecificationByCategoryId(Long id);
}
