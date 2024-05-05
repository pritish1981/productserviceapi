package com.scaler.productserviceapi.services;

import com.scaler.productserviceapi.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct();
    Product replaceProduct();
    Product createProduct(Product product);
    Product deleteProduct();
}
