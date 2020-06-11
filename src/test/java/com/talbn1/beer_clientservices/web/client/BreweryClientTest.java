package com.talbn1.beer_clientservices.web.client;

import com.talbn1.beer_clientservices.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/*talbn1 created on 6/7/20*/

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void saveNewBeer(){
        BeerDto dto = BeerDto.builder().beerName("New Beer").beerStyle("new Beer style").build();
        URI uri = client.saveNewBeer(dto);
        assertNotNull(dto);
        System.out.println(dto.toString());
    }

    @Test
    void updateBeer(){
        UUID uuid = UUID.randomUUID();
        BeerDto dto = BeerDto.builder().beerName("New Beer").beerStyle("new Beer style").build();
        client.updateBeer(uuid,dto);
    }

    @Test
    void deleteBeer(){
        UUID uuid = UUID.randomUUID();
        client.deleteBeer(uuid);
    }
}