package com.webservices.projetoWebServices.repositories;

import com.webservices.projetoWebServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
