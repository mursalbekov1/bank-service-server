package com.example.bankserviceserver.service;

import com.example.bankserviceserver.model.Account;
import com.example.bankserviceserver.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public List<Account> listAccount() {
        return accountRepository.findAll();
    }
}

