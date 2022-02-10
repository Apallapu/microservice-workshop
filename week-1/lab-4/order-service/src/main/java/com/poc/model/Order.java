package com.poc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("items")
    private Item items;
    @JsonProperty("shipping_address")
    private String shipppingAddress;


}