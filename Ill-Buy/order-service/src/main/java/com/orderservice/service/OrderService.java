package com.orderservice.service;

import com.orderservice.dto.order.OrderRequest;
import com.orderservice.model.Order;
import com.orderservice.repository.IOrderRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class OrderService {

    private final IOrderRepo IOrderRepo;

    public List<Order> getAllOrders() {
        return IOrderRepo.findAll();
    }

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID());


    }
    public Order addTestOrder() {
        Order order = new Order(
//                146,
//                5,
//                "SKU",
//                "ipone",
//                "It goes brrr",
//                "Electronics",
//                159.65f,
//                70.01f,
//                Date.from(Instant.now()),
//                true,
//                "Yes",
//                ""
        );
        return IOrderRepo.save(order);
    }

    public Order createOrder(OrderRequest orderRequest){

        if(orderRequest != null){
            Order newOrder = Order.builder()
                    .orderNumber(UUID.randomUUID())
                    .orderDescription(orderRequest.getOrderDescription())
//                .quantity(productRequest.getQuantity())
//                .skuCode(productRequest.getSkuCode())
//                .productName(productRequest.getProductName())
//                .description(productRequest.getDescription())
//                .category(productRequest.getCategory())
//                .price(productRequest.getPrice())
//                .discountPrice(productRequest.getDiscountPrice())
//                .creationDate(productRequest.getCreationDate())
//                .sellableOnline(productRequest.getSellableOnline())
//                .otherColors(productRequest.getOtherColors())
//                .productPicture(productRequest.getProductPicture())
                    .build();

        IOrderRepo.save(newOrder);
        log.info("Order number "+ newOrder.getOrderNumber() + " has been saved");
        return newOrder;
        }
        else{
            throw new RuntimeException("The order has formatting issues");
        }
    }
    public Order getOrderByUUID(UUID id) {
        return IOrderRepo.findById(id).orElse(null);
    }

}
