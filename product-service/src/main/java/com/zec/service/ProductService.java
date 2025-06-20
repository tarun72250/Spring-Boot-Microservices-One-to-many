package com.zec.service;

import com.zec.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zec.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository  productRepository;

    public Product  createProduct(Product product) {
        return productRepository.save(product);
    }

    public List <Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProductById(id);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

