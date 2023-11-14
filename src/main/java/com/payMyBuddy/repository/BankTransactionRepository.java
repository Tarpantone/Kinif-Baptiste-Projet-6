package com.payMyBuddy.repository;

import com.payMyBuddy.model.BankTransaction;
import com.payMyBuddy.model.id.BankTransactionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransactionRepository extends CrudRepository<BankTransaction, BankTransactionId> {
}
