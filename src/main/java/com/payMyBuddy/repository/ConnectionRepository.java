package com.payMyBuddy.repository;

import com.payMyBuddy.model.Connection;
import com.payMyBuddy.model.id.ConnectionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, ConnectionId> {
}
