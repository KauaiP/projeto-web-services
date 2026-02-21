package com.webservices.projetoWebServices.repositories;

import com.webservices.projetoWebServices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
