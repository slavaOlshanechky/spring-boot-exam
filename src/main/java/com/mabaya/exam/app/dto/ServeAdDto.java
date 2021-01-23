package com.mabaya.exam.app.dto;

import lombok.*;

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
