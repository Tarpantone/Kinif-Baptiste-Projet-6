package com.payMyBuddy.service;

import com.payMyBuddy.repository.BankAccountNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountNumberService {
    @Autowired
    private BankAccountNumberRepository bankAccountNumberRepository;
}
