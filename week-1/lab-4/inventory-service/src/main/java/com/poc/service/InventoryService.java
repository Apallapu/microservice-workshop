package com.poc.service;

import com.poc.model.Item;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface InventoryService {

   void updateInventory(Item item);

   List<Item> getInventories();
}
