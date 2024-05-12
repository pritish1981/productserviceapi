package com.scaler.productserviceapi.controllers;

import com.scaler.productserviceapi.exceptions.ProductLimitReachedException;
import com.scaler.productserviceapi.models.Product;
import com.scaler.productserviceapi.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
    Get - Getting a product
    Delete - Delete a product
    Post - Create a product
    Put - Replace a product
    Patch - Updating a product

    Get product - modify - put
 */

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    //Ideally should return a Product DTO
    public ResponseEntity<Product> getProductbyId(@PathVariable("id") Long id) throws ProductLimitReachedException {
     /* if(id>=0){
          throw new ProductLimitReachedException("There can be max 100 items");
      }*/
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProduct(product),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }

    @PatchMapping("{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("{id}")
    public Product deleteProductbyId(@PathVariable("id") Long id) {
        return new Product();
    }
}
