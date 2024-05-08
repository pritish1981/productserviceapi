package com.scaler.productserviceapi.exceptions;

public class ProductLimitReachedException extends Exception{
    public ProductLimitReachedException(String s){
        super(s);
    }
}
