package com.example.batchtuto.repository;

import com.example.batchtuto.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
