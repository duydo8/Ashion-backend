package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Account;
import com.example.ashionbackend.repositories.AccountRepository;
import com.example.ashionbackend.services.AccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	final AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public Account save(Account entity) {
		return accountRepository.save(entity);
	}

	@Override
	public Account findById(int id) {
		return accountRepository.findById(id);
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Page<Account> findAll(Pageable pageable) {
		return accountRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return accountRepository.updateByIdAndStatus(id, status);
	}
}
