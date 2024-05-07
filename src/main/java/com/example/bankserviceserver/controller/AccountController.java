package com.example.bankserviceserver.controller;

import com.example.bankserviceserver.model.Account;
import com.example.bankserviceserver.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/accountList")
    public List<Account> accounts() {
        return accountService.listAccount();
    }
}
