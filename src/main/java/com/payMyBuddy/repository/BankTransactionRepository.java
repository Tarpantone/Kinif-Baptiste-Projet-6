package com.payMyBuddy.repository;

import com.payMyBuddy.entity.BankTransaction;
import com.payMyBuddy.entity.id.BankTransactionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransactionRepository extends CrudRepository<BankTransaction, BankTransactionId> {
}
