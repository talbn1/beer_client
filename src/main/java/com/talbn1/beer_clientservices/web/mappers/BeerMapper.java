package com.talbn1.beer_clientservices.web.mappers;

import com.talbn1.beer_clientservices.domain.Beer;
import com.talbn1.beer_clientservices.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author talbn on 6/29/2020
 **/


//Extened the datemapper use in here
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

}
