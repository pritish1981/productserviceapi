package com.scaler.productserviceapi.controllers;

import com.scaler.productserviceapi.exceptions.ProductLimitReachedException;
import com.scaler.productserviceapi.models.Product;
import com.scaler.productserviceapi.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @MockBean
    ProductService productService;

    @Autowired
    ProductController productController;

    @Test
    void Test_WhenGetProductByIdIsCalled_ThenReturnProduct() throws ProductLimitReachedException {
        //Arrange
        Product product = new Product();
        product.setTitle("Arjun");
        product.setId(101L);
        //Rule
        when(productService.getProductById(any(Long.class))).thenReturn(product);
        //Act
        ResponseEntity<Product> responseEntity = productController.getProductbyId(101L);
        //Assert
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        assertEquals(101L, responseEntity.getBody().getId());
        assertEquals("Arjun", responseEntity.getBody().getTitle());
    }
}