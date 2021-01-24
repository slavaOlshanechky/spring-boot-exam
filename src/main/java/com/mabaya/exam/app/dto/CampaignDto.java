package com.mabaya.exam.app.dto;

import lombok.*;
import lombok.Builder;
import org.springframework.data.annotation.Id;

import java.nio.file.FileStore;
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

//    public CampaignDto(String name, LocalDate startDate, String category, Double bid) {
//        this.name=name;
//        this.startDate=startDate;
//        this.category=category;
//        this.bid=bid;
//
//    }
}
