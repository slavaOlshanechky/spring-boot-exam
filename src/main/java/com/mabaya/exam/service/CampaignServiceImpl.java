package com.mabaya.exam.service;

import com.mabaya.exam.dao.CampaignRepository;
import com.mabaya.exam.dto.AddCampaignDto;
import com.mabaya.exam.dto.CreatedCampaignResponseDto;
import com.mabaya.exam.model.Campaign;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Builder
@Service
public class CampaignServiceImpl implements CampaignService {
    @Autowired
    CampaignRepository campaignRepository;

    @Override
    public CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign) {
        //Campaign campaign = CampaignRepository.findByOwnerAndEventId(sessionLogin, eventId);
//if(!campaignRepository.findByName(name));
//        return CreatedCampaignResponseDto.builder()
//                .name()
//                .startDate()
//                .category()
//                .bid()
//                .build();

        return null;
    }
}
