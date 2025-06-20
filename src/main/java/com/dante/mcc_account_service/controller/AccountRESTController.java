package com.dante.mcc_account_service.controller;

import com.dante.mcc_account_service.dto.AccountDTO;
import com.dante.mcc_account_service.service.interfaces.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
@AllArgsConstructor
public class AccountRESTController {

    private IAccountService accountService;

    @GetMapping
    public List<AccountDTO> getAllAccounts() {
        return this.accountService.getAll();
    }

    @PostMapping
    public AccountDTO addAccount(@RequestBody AccountDTO accountDTO) {
        return this.accountService.add(accountDTO);
    }
}
