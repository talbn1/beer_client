package com.talbn1.beer_clientservices.bootstrap;

import com.talbn1.beer_clientservices.domain.Beer;
import com.talbn1.beer_clientservices.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

/**
 * @author talbn on 6/13/2020
 **/
// CommandLineRunner runs every time we starting the project

/*Indicates that an annotated class is a "component".
 Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.*/


public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0005975421675";
    public static final String BEER_2_UPC = "0123658735412";
    public static final String BEER_3_UPC = "0058425471523";


    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder().
                    beerName("Goldstar").
                    beerStyle("IPA").
                    quantityToBrew(200).
                    upc(BEER_1_UPC).
                    minOnHand(40).
                    price(new BigDecimal("12.45")).
                    build());
            beerRepository.save(Beer.builder().
                    beerName("Hineken").
                    beerStyle("light").
                    quantityToBrew(310).
                    upc(BEER_2_UPC).
                    minOnHand(20).
                    price(new BigDecimal("9.99")).
                    build());
            beerRepository.save(Beer.builder().
                    beerName("Guinness").
                    beerStyle("Lager").
                    quantityToBrew(239).
                    upc(BEER_3_UPC).
                    minOnHand(40).
                    price(new BigDecimal("39.39")).
                    build());
        }
        System.out.println("Loaded Beers = " + beerRepository.count());
    }
}
