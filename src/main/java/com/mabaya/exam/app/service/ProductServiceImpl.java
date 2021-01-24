package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dao.ProductsRepository;
import com.mabaya.exam.app.dto.ProductDto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Builder
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductsRepository productsRepository;


    @PostConstruct
    private void addProducts() {


        List<ProductDto> products = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            Double price =  10 * new Random().nextDouble();
            price = new BigDecimal(price).setScale(1, RoundingMode.UP).doubleValue();
            ProductDto pd = new ProductDto("serialNumber" + i, "Product" + i, "Category" + i,
                    price);
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
