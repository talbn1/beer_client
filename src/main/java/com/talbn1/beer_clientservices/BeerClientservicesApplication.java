package com.talbn1.beer_clientservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





@SpringBootApplication
@ComponentScan({"com.talbn1.beer_clientservices.repositories"})
public class BeerClientservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerClientservicesApplication.class, args);
    }

}
