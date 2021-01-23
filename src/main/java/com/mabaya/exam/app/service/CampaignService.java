package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;

import java.time.LocalDate;

public interface CampaignService {

    //CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign);

    CreatedCampaignResponseDto addNewCampaign(String name, LocalDate startDate, String category, Double bid);
}
