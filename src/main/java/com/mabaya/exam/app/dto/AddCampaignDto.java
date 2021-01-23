package com.mabaya.exam.app.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class AddCampaignDto {
    String name;
    LocalDate startDate;
    String category;
    Double bid;
}
