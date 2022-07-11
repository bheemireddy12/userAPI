package com.usersapi.endpoints.insert;

import com.usersapi.domain.user.User;
import com.usersapi.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserService {

    @Autowired
    UserRepository repository;

    public User insertUser(User user) {
        return repository.save(user);
    }
}