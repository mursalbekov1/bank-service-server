package com.example.bankserviceserver.repository;

import com.example.bankserviceserver.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
