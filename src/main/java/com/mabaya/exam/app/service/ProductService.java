package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.ProductDto;


public interface ProductService {

//    void addProducts(String productSerialNumber, String title, String category, Double price);
    ProductDto promotedProduct(String category);
}
