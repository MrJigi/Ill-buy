package com.productservice.repository;

import com.productservice.model.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@ComponentScan
@Repository
public interface IProductRepo extends JpaRepository<Product, UUID> {
}
