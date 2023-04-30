package com.orderservice.repository;

import com.orderservice.model.Order;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@ComponentScan
@Repository
public interface IOrderRepo extends JpaRepository<Order, UUID> {
}
