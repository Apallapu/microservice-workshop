package com.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details")
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "order_ref")
    private String order_ref;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "shipping_address")
    private String shipppingAddress;
    @Column( name = "payment_method")
    private String paymentMethod;
}
