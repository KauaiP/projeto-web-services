package com.webservices.projetoWebServices.repositories;

import com.webservices.projetoWebServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
