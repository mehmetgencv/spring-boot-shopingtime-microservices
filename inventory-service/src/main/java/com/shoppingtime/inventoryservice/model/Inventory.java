package com.shoppingtime.inventoryservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_inventory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String skuCode;
    private Integer quantity;

    public Inventory(String skuCode, Integer quantity) {
        this.skuCode = skuCode;
        this.quantity = quantity;
    }
}
