package com.mabaya.exam.dao;

import com.mabaya.exam.model.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CampaignRepository extends MongoRepository<Campaign, String> {

    Campaign findByName(String name);
}
