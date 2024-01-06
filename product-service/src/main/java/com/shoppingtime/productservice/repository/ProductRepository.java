package com.shoppingtime.productservice.repository;

import com.shoppingtime.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
