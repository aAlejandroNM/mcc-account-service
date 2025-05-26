package com.dante.mcc_account_service.repository;

import com.dante.mcc_account_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAccountRepository extends JpaRepository<Account, String> {

    Optional<Account> findByAccountNumberAndCustomerCu(String accountNumber,String customerCu);
}
