package com.talbn1.beer_clientservices.services;

import com.talbn1.beer_clientservices.web.model.BeerDto;
import com.talbn1.beer_clientservices.web.model.BeerPagedList;
import com.talbn1.beer_clientservices.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

/**
 * @author talbn on 6/29/2020
 **/

public interface BeerServices {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);


}
