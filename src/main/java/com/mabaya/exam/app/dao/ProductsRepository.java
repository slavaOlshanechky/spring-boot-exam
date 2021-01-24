package com.mabaya.exam.app.dao;

import com.mabaya.exam.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface ProductsRepository extends MongoRepository<ProductDto, String> {


}
