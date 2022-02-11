package com.poc.client;

import com.poc.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("inventory")
@Component
public interface InventoryFeignClient {
    @PutMapping(value = "/api/v1/item",consumes = "application/json",produces = "application/json")
    public void updateInventory(@RequestBody Item item);


}
