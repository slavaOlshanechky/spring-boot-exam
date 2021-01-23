package com.mabaya.exam.app.controller;


import com.mabaya.exam.app.dto.AddCampaignDto;
import com.mabaya.exam.app.dto.CreatedCampaignResponseDto;
import com.mabaya.exam.app.dto.ServeAdDto;
import com.mabaya.exam.app.service.CampaignService;
import com.mabaya.exam.app.service.ServeAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping//("/mabaya")
public class AppController {

    @Autowired
    CampaignService CampaignService;

    @Autowired
    ServeAdService ServeAdService;

    @PostMapping("/createCampaign/{name}/{startDate}/{category}/{bid}")
    public CreatedCampaignResponseDto createCampaign(@PathVariable String name, @PathVariable LocalDate startDate,
                                                     @PathVariable String category, @PathVariable Double bid) {//@RequestBody AddCampaignDto newCampaign
        return CampaignService.addNewCampaign(name,startDate,category,bid);
    }

    @GetMapping("/serveAd/{category}")
    public ServeAdDto serveAd(@PathVariable String category) {
        return ServeAdService.promotedProduct(category);
    }


}
