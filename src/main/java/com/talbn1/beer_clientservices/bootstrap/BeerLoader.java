package com.talbn1.beer_clientservices.bootstrap;

import com.talbn1.beer_clientservices.domain.Beer;
import com.talbn1.beer_clientservices.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author talbn on 6/13/2020
 **/
// CommandLineRunner runs every time we starting the project

/*Indicates that an annotated class is a "component".
 Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.*/
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("534534583458736450983475094387504398570349857340958734095873409");
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder().
                    beerName("Goldstar").
                    beerStyle("IPA").
                    quantityToBrew(200).
                    upc(325325325325L).
                    minOnHand(40).
                    price(new BigDecimal("12.45")).
                    build());
            beerRepository.save(Beer.builder().
                    beerName("Hineken").
                    beerStyle("light").
                    quantityToBrew(310).
                    upc(325000000112L).
                    minOnHand(20).
                    price(new BigDecimal("9.99")).
                    build());
            beerRepository.save(Beer.builder().
                    beerName("Ginnes").
                    beerStyle("Lager").
                    quantityToBrew(239).
                    upc(3239393939L).
                    minOnHand(40).
                    price(new BigDecimal("39.39")).
                    build());
        }
        System.out.println("Loaded Beers = " + beerRepository.count());
    }
}
