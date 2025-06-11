package com.zec.client;

import com.zec.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8081") // Adjust URL as needed
public interface ProductClient {
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable("id") Long id);
}

