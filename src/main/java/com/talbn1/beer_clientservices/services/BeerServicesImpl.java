package com.talbn1.beer_clientservices.services;

import com.talbn1.beer_clientservices.domain.Beer;
import com.talbn1.beer_clientservices.repositories.BeerRepository;
import com.talbn1.beer_clientservices.web.controller.NotFoundException;
import com.talbn1.beer_clientservices.web.mappers.BeerMapperImpl;
import com.talbn1.beer_clientservices.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author talbn on 6/29/2020
 **/

@Service
@RequiredArgsConstructor
public class BeerServicesImpl implements BeerServices {

    private final BeerRepository beerRepository;
    private final BeerMapperImpl beerMapper;


    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRepository
                        .findById(beerId)
                        .orElseThrow(() -> new NotFoundException()));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.BeerDtoToBeer(beerDto)));

    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
