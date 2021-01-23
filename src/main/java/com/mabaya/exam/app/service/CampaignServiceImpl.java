package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dao.CampaignRepository;
import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Builder
@Service
public class CampaignServiceImpl implements CampaignService {
    @Autowired
    CampaignRepository campaignRepository;

    @Override
    public CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign) {
        //Campaign campaign = CampaignRepository.findByOwnerAndEventId(sessionLogin, eventId);
//if(!campaignRepository.findByName(name));
//        return CreatedCampaignResponseDto.builder() //it does not work
//                .name()
//                .startDate()
//                .category()
//                .bid()
//                .build();

        return null;
    }
}
