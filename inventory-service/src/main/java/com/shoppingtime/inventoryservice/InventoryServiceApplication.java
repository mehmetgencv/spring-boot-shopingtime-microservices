package com.shoppingtime.inventoryservice;

import com.shoppingtime.inventoryservice.model.Inventory;
import com.shoppingtime.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory(
                    "iphone_15",
                    5);
            Inventory inventory1 = new Inventory(
                    "iphone_15_pro",
                    2);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }
}