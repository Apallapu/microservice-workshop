package com.poc.service;

import com.poc.entity.InventoryEntity;
import com.poc.model.Item;
import com.poc.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Override
    public void updateInventory(Item item) {
        InventoryEntity inventoryEntity= InventoryEntity.builder()
                .code(item.getCode())
                .qty(item.getQty())
                .build();
        inventoryRepository.save(inventoryEntity);

    }

    @Override
    public List<Item> getInventories() {
        return inventoryRepository.findAll().stream().map(this::entityToModel).collect(Collectors.toList());

    }

    private Item entityToModel(InventoryEntity inventoryEntity) {
     return Item.builder()
                .code(inventoryEntity.getCode())
                .qty(inventoryEntity.getQty())
                .id(inventoryEntity.getId())
                .build();

    }
}
