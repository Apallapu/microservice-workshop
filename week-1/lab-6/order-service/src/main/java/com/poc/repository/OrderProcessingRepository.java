package com.poc.repository;

import com.poc.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProcessingRepository extends JpaRepository<OrderEntity,Long> {
}
