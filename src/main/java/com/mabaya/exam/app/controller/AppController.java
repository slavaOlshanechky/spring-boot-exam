package com.mabaya.exam.app.controller;


import com.mabaya.exam.app.dto.CampaignDto;
import com.mabaya.exam.app.dto.ProductDto;
import com.mabaya.exam.app.service.CampaignService;
import com.mabaya.exam.app.service.ProductService;
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
    ProductService ProductService;

    @PostMapping("/createCampaign/{name}/{startDate}/{category}/{bid}")
    public CampaignDto createCampaign(@PathVariable String name, @PathVariable LocalDate startDate,
                                      @PathVariable String category, @PathVariable Double bid) {
        return CampaignService.addNewCampaign(name,startDate,category,bid);
    }

    @GetMapping("/serveAd/{category}")
    public ProductDto serveAd(@PathVariable String category) {

        return ProductService.promotedProduct(category);
    }


}
