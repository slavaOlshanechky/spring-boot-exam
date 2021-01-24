package com.mabaya.exam;

import com.mabaya.exam.app.dao.ProductsRepository;
import com.mabaya.exam.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootExamApplication {

//    @Autowired
//    ProductsRepository productsRepository;

    public static void main(String[] args) {
       // initializeDB();

        //productsRepository.save(initializeDB());

        SpringApplication.run(SpringBootExamApplication.class, args);
    }

//    public static void initializeDB() {
//
//        int maxPrice = 100;
//        int minPrice = 1;
//        List<ProductDto> products = new ArrayList<ProductDto>();
//        for (int i = 0; i < 100; i++) {
//            ProductDto pd = new ProductDto("serialNumber"+i,"Prod" + i, "cat" + i,
//                    (double) ((int) (Math.random() * ((maxPrice - minPrice) + 1)) + minPrice));
//            products.add(pd);
//        }
//        for (ProductDto product : products) {
//            //productsRepository.save(product);
//        }
//    }
}
