package com.payMyBuddy.repository;

import com.payMyBuddy.model.BankAccountNumber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountNumberRepository extends CrudRepository<BankAccountNumber,String> {
}
