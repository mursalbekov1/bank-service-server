package com.example.bankserviceserver.repository;

import com.example.bankserviceserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
