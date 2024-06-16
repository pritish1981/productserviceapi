package com.scaler.productserviceapi.controllers;

import com.scaler.productserviceapi.dtos.SearchRequestDto;
import com.scaler.productserviceapi.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scaler.productserviceapi.services.SearchService;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService){
        this.searchService = searchService;
    }
    @PostMapping
    public List<Product> search(@RequestBody SearchRequestDto searchDto){
      return searchService.search(searchDto.getKeyword(), searchDto.getPageNUmber(), searchDto.getPageSize());
    }
}

