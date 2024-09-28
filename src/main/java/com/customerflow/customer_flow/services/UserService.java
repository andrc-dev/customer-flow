package com.customerflow.customer_flow.services;

import com.customerflow.customer_flow.UserRepository;
import com.customerflow.customer_flow.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

