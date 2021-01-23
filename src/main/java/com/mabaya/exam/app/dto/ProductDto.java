package com.mabaya.exam.app.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Builder
@Getter
@ToString
public class ProductDto {
    @Id
    String productSerialNumber;
    String title;
    String category;
    Double price;


    public ProductDto(String productSerialNumber, String title, String category, Double price) {
        this.productSerialNumber = productSerialNumber;
        this.title = title;
        this.category = category;
        this.price = price;
    }
}
