package com.payMyBuddy.service;

import com.payMyBuddy.repository.ApplicationTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationTransactionService {
    @Autowired
    private ApplicationTransactionRepository applicationTransactionRepository;
}
