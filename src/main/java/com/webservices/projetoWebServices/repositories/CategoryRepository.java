package com.webservices.projetoWebServices.repositories;

import com.webservices.projetoWebServices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
