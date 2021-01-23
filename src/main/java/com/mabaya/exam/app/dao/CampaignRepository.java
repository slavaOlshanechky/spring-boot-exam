package com.mabaya.exam.app.dao;

import com.mabaya.exam.app.model.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CampaignRepository extends MongoRepository<Campaign, String>{

    Campaign findByName(String name);
}
