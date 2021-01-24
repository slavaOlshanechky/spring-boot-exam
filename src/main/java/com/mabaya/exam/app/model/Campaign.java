package com.mabaya.exam.app.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
@EqualsAndHashCode(of = { "name" })
@Document(collection = "Campaigns")

public class Campaign {
    @Id
    String name;
    LocalDate startDate;
    String category;
    int bid;
}
