package com.jojo.msscbrewery.services;

import com.jojo.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getBeerById(UUID beerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Name")
                .build();
    }
}
