package com.zec.controller;

import com.zec.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zec.service.ProductService;

import java.util.List;

@RestController
@RequestMapping ("/products")
public class ProductController {
    @Autowired
    private ProductService  productService;

    @PostMapping
    public Product  createProduct(@RequestBody  Product product) {
        return productService.createProduct(product);
    }

    @GetMapping
    public List <Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return productService.updateProduct(id, productDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

