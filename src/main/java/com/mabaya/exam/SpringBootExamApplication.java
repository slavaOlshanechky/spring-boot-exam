package com.mabaya.exam;

import com.mabaya.exam.app.dto.ProductDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootExamApplication {

    public static void main(String[] args) {
        initializeDB();
        SpringApplication.run(SpringBootExamApplication.class, args);
    }

    public static void initializeDB() {
        int maxPrice = 100;
        int minPrice = 1;
        List<ProductDto> products = new ArrayList<ProductDto>();
        for (int i = 0; i < 100; i++) {
            ProductDto pd = new ProductDto("Prod" + i, "cat" + i,
                    (double) ((int) (Math.random() * ((maxPrice - minPrice) + 1)) + minPrice));
            products.add(pd);
        }
    }
}
