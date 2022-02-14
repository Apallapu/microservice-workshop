package com.poc.service;

import com.poc.client.InventoryClient;
import com.poc.client.InventoryFeignClient;
import com.poc.entity.OrderEntity;
import com.poc.model.Order;
import com.poc.model.OrderResponse;
import com.poc.repository.OrderProcessingRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderProcessingServiceImpl implements OrderProcessingService {


    @Autowired
    private OrderProcessingRepository orderProcessingRepository;
    @Autowired
    private InventoryFeignClient inventoryFeignClient;


    @Override
    @CircuitBreaker(name = "inventorySupport",fallbackMethod="inventorySupportFallback")
    @Retry(name = "retryForInventoryDetails", fallbackMethod = "inventorySupportFallback")
    @RateLimiter(name = "rateLimiterInventoryDetails", fallbackMethod = "inventorySupportFallback")
    public OrderResponse createOrder(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        OrderEntity orderEntity = OrderEntity.builder()
                .customerId(order.getCustomerId())
                .order_ref(UUID.randomUUID().toString())
                .orderStatus("Shipped")
                .paymentMethod(order.getPaymentMethod())
                .shipppingAddress(order.getShipppingAddress())
                .build();
        inventoryFeignClient.updateInventory(order.getItems());
        OrderEntity newOrder = orderProcessingRepository.save(orderEntity);
        orderResponse.setOrderId(newOrder.getOrder_ref());
        orderResponse.setMessage("success");
        return orderResponse;
    }

    public OrderResponse inventorySupportFallback(Order order,Throwable t) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setMessage(" inventory service is down ");
        return orderResponse;
    }


}
