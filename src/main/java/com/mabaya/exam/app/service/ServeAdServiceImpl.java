package com.mabaya.exam.app.service;

import com.mabaya.exam.app.dto.ServeAdDto;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Builder
@Service
public class ServeAdServiceImpl implements ServeAdService {
    @Override
    public ServeAdDto promotedProduct(String category) {
        return null;
    }
}
