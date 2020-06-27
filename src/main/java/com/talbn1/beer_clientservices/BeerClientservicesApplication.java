package com.talbn1.beer_clientservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





@SpringBootApplication
public class BeerClientservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerClientservicesApplication.class, args);
    }

}
