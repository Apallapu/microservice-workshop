package com.poc.controller;

import com.poc.model.Order;
import com.poc.model.OrderResponse;
import com.poc.service.OrderProcessingService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Order Api", description = "Order Api")
@Slf4j
public class OrderProcessingController {


    @Autowired
    private OrderProcessingService orderProcessingService;

    @Operation(summary = "order create Api", description = "order create  Api", tags = {"Order Api"})
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "successfully operation",
                    content = @Content(schema = @Schema(implementation = Order.class))),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Internal server"),
    })
    @PostMapping(value = "/order", consumes = "application/json", produces = "application/json")
    public OrderResponse createOrder(@RequestBody Order order) {
        return orderProcessingService.createOrder(order);
    }

}
