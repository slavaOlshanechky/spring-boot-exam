package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dao.CampaignRepository;
import com.mabaya.exam.app.dto.CampaignDto;
import com.mabaya.exam.app.dto.ProductDto;
import com.mabaya.exam.app.model.Campaign;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@Service
public class CampaignServiceImpl implements CampaignService {
    @Autowired
    CampaignRepository campaignRepository;




    @Override
    public CampaignDto addNewCampaign(String name, LocalDate startDate, String category, int bid) {

       // List<CampaignDto> campaigns = new ArrayList<>();
        // if(!campaignRepository.findByName(name));
        Campaign campaign = Campaign.builder()
                .name(name)
                .startDate(startDate)
                .category(category)
                .bid(bid)
                .build();

        campaignRepository.save(campaign);

        return  CampaignDto.builder()
                .name(name)
                .startDate(startDate)
                .category(category)
                .bid(bid)
                .build();
    }
}
