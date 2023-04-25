package com.jojo.msscbrewery.services;

import com.jojo.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getBeerById(UUID customerId);
}
