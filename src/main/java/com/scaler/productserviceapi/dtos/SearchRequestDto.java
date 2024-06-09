package com.scaler.productserviceapi.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {
    String keyword;
    int pageNUmber;
    int pageize;


}
