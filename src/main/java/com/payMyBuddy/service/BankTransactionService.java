package com.payMyBuddy.service;

import com.payMyBuddy.repository.BankTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankTransactionService {
    @Autowired
    private BankTransactionRepository bankTransactionRepository;
}
