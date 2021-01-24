package com.mabaya.exam.app.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@EqualsAndHashCode(of = { "productSerialNumber" })
@Document(collection = "Products")

public class ProductDto {
    @Id
    String productSerialNumber;
    String title;
    String category;
    Double price;

}
