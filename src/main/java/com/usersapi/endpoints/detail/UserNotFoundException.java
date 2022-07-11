package com.usersapi.endpoints.detail;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long phone_number) {
        super("Could not find user with phone_number " + phone_number + ".");
    }
}
