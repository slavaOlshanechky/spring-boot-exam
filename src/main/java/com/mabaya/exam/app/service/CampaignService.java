package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;

public interface CampaignService {

    CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign);
}
