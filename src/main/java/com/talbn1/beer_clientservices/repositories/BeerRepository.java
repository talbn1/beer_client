package com.talbn1.beer_clientservices.repositories;


import com.talbn1.beer_clientservices.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}


