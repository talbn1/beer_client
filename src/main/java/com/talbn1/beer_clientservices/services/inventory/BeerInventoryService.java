package com.talbn1.beer_clientservices.services.inventory;

import java.util.UUID;

/**
 * @author talbn on 6/30/2020
 **/

public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);
}
