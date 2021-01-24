package com.mabaya.exam.app.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString


public class CampaignDto {
    @Id
    String name;
    LocalDate startDate;
    String category;
    int bid;

}
