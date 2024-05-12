package com.scaler.productserviceapi.services;

import com.scaler.productserviceapi.models.Category;
import com.scaler.productserviceapi.models.Product;
import com.scaler.productserviceapi.repos.CategoryRepo;
import com.scaler.productserviceapi.repos.ProductRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
@Primary
public class SelfProductService implements ProductService{
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;

    public SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo){
     this.productRepo = productRepo;
     this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if(product.isEmpty()){
            throw new EntityNotFoundException("Product not found");
        }
        return product.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct() {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Category category= product.getCategory();
        if(category.getId() == null) {
            Category savedCategory = categoryRepo.save(category);
            product.setCategory(savedCategory);
        }
        //categoryRepo.findByTitle(product.getCategory().getTitle());
        product.setCreatedAt("11th May");
        Product savedProduct = productRepo.save(product);
        return savedProduct;
    }

    @Override
    public Product deleteProduct() {
        return null;
    }
}
