package com.poc.controller;

import com.poc.model.Item;
import com.poc.service.InventoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Inventory Api", description = "Inventory Api")
@Slf4j
public class InventoryController {


    @Autowired
    private InventoryService inventoryService;

    @Operation(summary = "Inventory update Api", description = "Inventory update Api", tags = {"Inventory Api"})
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "successfully operation",
                    content = @Content(schema = @Schema(implementation = Item.class))),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Internal server"),
    })
    @PutMapping(value = "/item",consumes = "application/json",produces = "application/json")
    public void updateInventory(@RequestBody Item item){
        inventoryService.updateInventory(item);

    }

    @Operation(summary = "Inventory get Api", description = "Inventory get Api", tags = {"Inventory Api"})
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "successfully operation",
                    content = @Content(schema = @Schema(implementation = List.class))),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Internal server"),
    })
    @GetMapping(value = "/items",produces = "application/json")
    public List<Item> getInventories(){
        return inventoryService.getInventories();

    }
}
