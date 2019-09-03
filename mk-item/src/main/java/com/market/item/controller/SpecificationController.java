package com.market.item.controller;

import com.market.item.model.Specification;
import com.market.item.service.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SpecificationController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/3
 * @Version V1.0
 **/
@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private ISpecificationService specificationService;

    @GetMapping("groups/{id}")
    public ResponseEntity<String> querySpecificationByCategoryId(@PathVariable("id") Long id){
        Specification specification=specificationService.querySpecificationByCategoryId(id);
        if(specification==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(specification.getSpecifications());
    }
}
