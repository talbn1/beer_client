package com.talbn1.beer_clientservices.web.mappers;

import com.talbn1.beer_clientservices.domain.Beer;
import com.talbn1.beer_clientservices.services.inventory.BeerInventoryService;
import com.talbn1.beer_clientservices.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author talbn on 6/30/2020
 **/
public class BeerMapperDecorator implements BeerMapper {

    private BeerInventoryService beerInventoryService;
    private BeerMapper beerMapper;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Autowired
    public void setBeerMapper(BeerMapper beerMapper) {
        this.beerMapper = beerMapper;
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        return beerMapper.beerToBeerDto(beer);
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(Beer beer) {
        BeerDto dto = beerMapper.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnhandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        return beerMapper.beerDtoToBeer(dto);
    }
}
