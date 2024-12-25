package com.bankApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankApplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
