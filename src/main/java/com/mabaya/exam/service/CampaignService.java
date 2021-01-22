package com.mabaya.exam.service;

import com.mabaya.exam.dto.AddCampaignDto;
import com.mabaya.exam.dto.CreatedCampaignResponseDto;

public interface CampaignService {

    CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign);
}
