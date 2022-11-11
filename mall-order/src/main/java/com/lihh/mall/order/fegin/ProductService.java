package com.lihh.mall.order.fegin;

import com.lihh.mall.commons.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "mall-product")
public interface ProductService {
    @GetMapping("/product/brand/all")
    R queryAllBrand();
}
