package com.orderservice.controller;

import com.orderservice.dto.order.OrderRequest;
import com.orderservice.dto.order.OrderResponse;
import com.orderservice.model.Order;
import com.orderservice.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class orderController {

    private OrderService orderService;

    @Autowired
    public orderController(OrderService orderService){this.orderService = orderService;}

    @GetMapping("/getAll")
    public List<Order> getAllOrders() {return orderService.getAllOrders();}

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public void addTest(){
        orderService.addTestOrder();
    }
    //Crud
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable UUID id) {return orderService.getOrderByUUID(id); }

    //Need to add {id} in post mapping to consume users id to register the new order
    @PostMapping("/newOrder")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse createOrder(@RequestBody OrderRequest orderRequest){
        Order newOrder = orderService.createOrder(orderRequest);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderNumber(newOrder.getOrderNumber());
        orderResponse.setOrderDescription(newOrder.getOrderDescription());
        return orderResponse;
    }




}
