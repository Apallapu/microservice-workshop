package com.poc.repository;

import com.poc.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity,Long> {
}
