package com.poc.client;

import com.poc.model.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class InventoryClient {

    private static final String INVENTORY_URI = "http://localhost:7171/api/v1";

    @Autowired
    private RestTemplate restTemplate;

    public void updateInventory(Item item) {
        log.debug("InventoryClient:::::updateInventory method start ::::");
        try {
            restTemplate.put(INVENTORY_URI + "/item", item);

        } catch (RestClientException e) {
            log.debug("InventoryClient:::::updateInventory error occurred ::::", e.getMessage());
        }

    }
}
