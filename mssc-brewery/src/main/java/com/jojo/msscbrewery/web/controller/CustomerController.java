package com.jojo.msscbrewery.web.controller;

import com.jojo.msscbrewery.services.BeerService;
import com.jojo.msscbrewery.web.model.BeerDto;
import com.jojo.msscbrewery.services.CustomerService;
import com.jojo.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {

        return new ResponseEntity<>(customerService.getBeerById(customerId), HttpStatus.OK);
    }
}
