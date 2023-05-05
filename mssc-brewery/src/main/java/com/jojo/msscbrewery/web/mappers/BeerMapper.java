package com.jojo.msscbrewery.web.mappers;

import com.jojo.msscbrewery.domain.Beer;
import com.jojo.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}