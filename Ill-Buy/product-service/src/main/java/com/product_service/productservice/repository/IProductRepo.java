package com.product_service.productservice.repository;

import com.product_service.productservice.model.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@ComponentScan
@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
}
