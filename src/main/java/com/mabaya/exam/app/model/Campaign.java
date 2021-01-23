package com.mabaya.exam.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class Campaign {
    @Id
    String name;
    LocalDate startDate;
    String category;
    Double bid;
}
