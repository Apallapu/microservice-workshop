package com.poc.service;

import com.poc.model.Order;
import com.poc.model.OrderResponse;

public interface OrderProcessingService {
    OrderResponse createOrder(Order order);
}
