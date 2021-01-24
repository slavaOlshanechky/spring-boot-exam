package com.mabaya.exam.app.model;
import lombok.*;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "productSerialNumber" })
@Document(collection = "Products")


public class Product {
   @Id
   String productSerialNumber;
   String title;
   String category;
   Double price;
}
