package com.jojo.msscbrewery.web.mappers;

import com.jojo.msscbrewery.domain.Customer;
import com.jojo.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
