package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.ProductDto;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Builder
@Service
public class ServeAdServiceImpl implements ServeAdService {
    @Override
    public ProductDto promotedProduct(String category) {


        return new ProductDto("New title",category,23.0);
    }
}
