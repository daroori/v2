package com.marketplace.service;

import com.marketplace.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    // Other methods can be defined here
}
