package com.mabaya.exam.app.dto;

import lombok.*;

@NoArgsConstructor
@Builder
@Getter
@ToString
public class ProductDto {

    String title;
    String category;
    Double price;



    public ProductDto(String title, String category, Double price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }
}
