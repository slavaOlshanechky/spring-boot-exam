package com.mabaya.exam.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString


public class CreatedCampaignResponseDto {
    String name;
    LocalDate startDate;
    String category;
    Double bid;


}
