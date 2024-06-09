package com.scaler.productserviceapi.services;

import com.scaler.productserviceapi.models.Product;
import com.scaler.productserviceapi.repos.ProductRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class SearchService{
    private ProductRepo productRepo;

    public SearchService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> search(String keyword, int pageNumber, int pageSize){
      return  productRepo.findByTitleContains(keyword, (Pageable) PageRequest.of(pageNumber, pageSize));
    }

}
