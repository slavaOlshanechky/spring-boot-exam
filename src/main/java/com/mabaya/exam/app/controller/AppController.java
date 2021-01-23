package com.mabaya.exam.app.controller;


import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;
import com.mabaya.exam.app.dto.ServeAdDto;
import com.mabaya.exam.app.service.CampaignService;
import com.mabaya.exam.app.service.ServeAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mabaya")
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
