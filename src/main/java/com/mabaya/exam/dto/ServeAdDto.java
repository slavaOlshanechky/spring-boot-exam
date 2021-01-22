package com.mabaya.exam.dto;

import com.mabaya.exam.model.Product;
import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class ServeAdDto {

    String title;
    String category;
    Double price;

}
