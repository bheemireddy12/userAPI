package com.usersapi.endpoints.detail;

import com.usersapi.domain.user.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users/{phone_number}")
@Api(tags = "Get user by phone number")
public class DetailUserController {

    @Autowired
    DetailUserService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get user by phone number")
    public ResponseEntity<User> list(@PathVariable Long phone_number) {
        return ResponseEntity.ok().body(service.listUser(phone_number));
    }
}

