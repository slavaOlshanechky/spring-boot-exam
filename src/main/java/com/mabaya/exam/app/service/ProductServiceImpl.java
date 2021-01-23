package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dao.ProductsRepository;
import com.mabaya.exam.app.dto.ProductDto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Builder
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductsRepository productsRepository;

    @Override
    public void addProducts(String productSerialNumber, String title, String category, Double price) {

        int maxPrice = 100;
        int minPrice = 1;

        List<ProductDto> products = new ArrayList<ProductDto>();

        for (int i = 0; i < 100; i++) {
            ProductDto pd = new ProductDto("serialNumber" + i, "Prod" + i, "cat" + i,
                    (double) ((int) (Math.random() * ((maxPrice - minPrice) + 1)) + minPrice));
            products.add(pd);
        }

        for (ProductDto product : products) {
            productsRepository.save(product);
        }
    }

    @Override
    public ProductDto promotedProduct(String category) {


        return new ProductDto("new serialNumber", "New title", category, 23.0);
    }
}
