package com.mabaya.exam.controller;


import com.mabaya.exam.dto.AddCampaignDto;
import com.mabaya.exam.dto.CreatedCampaignResponseDto;
import com.mabaya.exam.dto.ServeAdDto;
import com.mabaya.exam.service.CampaignService;
import com.mabaya.exam.service.ServeAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AppController {

    @Autowired
    CampaignService campaignService;

    @Autowired
    ServeAdService serveAdService;

    @PostMapping("/createCampaign/{name}/{startDate}/{category}/{bid}")
    public CreatedCampaignResponseDto createCampaign(@RequestBody AddCampaignDto newCampaign) {
        return campaignService.addNewCampaign(newCampaign);
    }

    @GetMapping("/serveAd/{category}")
    public ServeAdDto serveAd(@PathVariable String category) {
        return serveAdService.promotedProduct(category);
    }



}
