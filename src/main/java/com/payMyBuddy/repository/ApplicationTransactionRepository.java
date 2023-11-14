package com.payMyBuddy.repository;

import com.payMyBuddy.model.ApplicationTransaction;
import com.payMyBuddy.model.id.ApplicationTransactionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationTransactionRepository extends CrudRepository<ApplicationTransaction, ApplicationTransactionId> {
}
