package com.jojo.restdocsexample.web.mappers;

import com.jojo.restdocsexample.domain.Beer;
import com.jojo.restdocsexample.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-09T22:37:52-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto BeerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
