package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.CampaignDto;

import java.time.LocalDate;

public interface CampaignService {

    //CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign);

    CampaignDto addNewCampaign(String name, LocalDate startDate, String category, Double bid);
}
