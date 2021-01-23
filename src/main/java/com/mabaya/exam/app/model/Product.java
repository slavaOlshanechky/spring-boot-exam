package com.mabaya.exam.app.model;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class Product {
   @Id
   String productSerialNumber;
   String title;
   String category;
   Double price;
}
