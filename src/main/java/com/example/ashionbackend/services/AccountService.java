package com.example.ashionbackend.services;

import com.example.ashionbackend.config.IGenericService;
import com.example.ashionbackend.entities.Account;
import com.example.ashionbackend.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AccountService extends IGenericService<Account> {

}
