package com.jojo.restdocsexample.web.mappers;

import com.jojo.restdocsexample.web.model.BeerDto;
import com.jojo.restdocsexample.domain.Beer;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
