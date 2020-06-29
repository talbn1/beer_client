package com.talbn1.beer_clientservices.services;

import com.talbn1.beer_clientservices.web.model.BeerDto;

import java.util.UUID;

/**
 * @author talbn on 6/29/2020
 **/

public interface BeerServices {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
