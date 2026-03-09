package com.webservices.projetoWebServices.repositories;

import com.webservices.projetoWebServices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}