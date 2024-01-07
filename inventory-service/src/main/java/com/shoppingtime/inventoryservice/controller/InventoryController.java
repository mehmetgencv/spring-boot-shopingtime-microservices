package com.shoppingtime.inventoryservice.controller;

import com.shoppingtime.inventoryservice.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Boolean> isInStock(@PathVariable("sku-code") String skuCode){

        return ResponseEntity.ok(inventoryService.isInStock(skuCode));
    }
}
