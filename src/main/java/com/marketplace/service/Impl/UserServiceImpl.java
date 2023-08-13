package com.marketplace.service.Impl;

import com.marketplace.model.User;
import javax.sql.DataSource;
import com.marketplace.repository.UserRepository;
import com.marketplace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final DataSource dataSource;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, DataSource dataSource) {
        this.userRepository = userRepository;
        this.dataSource = dataSource;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    // Other methods can be implemented here
}
