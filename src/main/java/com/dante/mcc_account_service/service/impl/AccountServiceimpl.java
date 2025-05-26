package com.dante.mcc_account_service.service.impl;

import com.dante.mcc_account_service.dto.AccountDTO;
import com.dante.mcc_account_service.entity.Account;
import com.dante.mcc_account_service.repository.IAccountRepository;
import com.dante.mcc_account_service.service.interfaces.IAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class AccountServiceimpl implements IAccountService {

    private IAccountRepository accountRepository;

    @Override
    public List<AccountDTO> getAll() {
        return accountRepository.findAll()
                .stream()
                .map(Account::getDTO)
                .toList();
    }

    @Override
    public AccountDTO add(AccountDTO accountDTO) {
        log.info("Adding account: {}", accountDTO);
        Account account = new Account();
        account.setData(accountDTO);
        return this.accountRepository.save(account).getDTO();
    }

    @Override
    public AccountDTO update(AccountDTO accountDTO) {
        return null;
    }

    @Override
    public AccountDTO delete(AccountDTO accountDTO) {
        return null;
    }

    @Override
    public AccountDTO getById(String id) {
        return null;
    }
}
