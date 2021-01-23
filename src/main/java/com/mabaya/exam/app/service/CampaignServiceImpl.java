package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Builder
@Service
public class CampaignServiceImpl implements CampaignService {
//    @Autowired
//    CampaignRepository campaignRepository;

//    @Override
//    public CreatedCampaignResponseDto addNewCampaign(AddCampaignDto newCampaign) {
//        //Campaign campaign = CampaignRepository.findByOwnerAndEventId(sessionLogin, eventId);
////if(!campaignRepository.findByName(name));
////        return CreatedCampaignResponseDto.builder() //it does not work
////                .name()
////                .startDate()
////                .category()
////                .bid()
////                .build();
//
//        return null;
//    }

    @Override
    public CreatedCampaignResponseDto addNewCampaign(String name, LocalDate startDate, String category, Double bid) {
        return null;
    }
}
