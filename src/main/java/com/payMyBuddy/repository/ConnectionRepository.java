package com.payMyBuddy.repository;

import com.payMyBuddy.entity.Connection;
import com.payMyBuddy.entity.id.ConnectionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, ConnectionId> {
}
