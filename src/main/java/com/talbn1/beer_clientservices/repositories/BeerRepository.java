package com.talbn1.beer_clientservices.repositories;


import com.talbn1.beer_clientservices.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}


