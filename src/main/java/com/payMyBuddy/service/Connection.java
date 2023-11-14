package com.payMyBuddy.service;

import com.payMyBuddy.repository.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Connection {
    @Autowired
    private ConnectionRepository connectionRepository;
}
