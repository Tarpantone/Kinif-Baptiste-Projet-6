package com.payMyBuddy.repository;

import com.payMyBuddy.entity.ApplicationTransaction;
import com.payMyBuddy.entity.id.ApplicationTransactionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationTransactionRepository extends CrudRepository<ApplicationTransaction, ApplicationTransactionId> {
}
