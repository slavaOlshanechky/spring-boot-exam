package com.mabaya.exam.app.dao;

import com.mabaya.exam.app.dto.ProductDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<ProductDto, String> {
}
