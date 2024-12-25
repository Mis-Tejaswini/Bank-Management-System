package com.bankApplication.service;

import java.util.List;

import com.bankApplication.entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(long accountNumber);
	public List<Account> getAllAccountDetails();
	public Account depositAmount(long accountNumber, Double amount);
	public Account withdrawAmount(long accountNumber, Double amount);
	public void closeAccount(long accountNumber);
}
