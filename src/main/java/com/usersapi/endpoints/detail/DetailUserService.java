package com.usersapi.endpoints.detail;

import com.usersapi.domain.user.User;
import com.usersapi.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailUserService {

    @Autowired
    UserRepository repository;

    public User listUser(Long phone_number) {
        return repository.findById(phone_number)
                .orElseThrow(() -> new UserNotFoundException(phone_number));
    }
}