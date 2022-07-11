package com.usersapi.endpoints.unit.service;

import com.usersapi.domain.user.User;
import com.usersapi.domain.user.UserRepository;
import com.usersapi.endpoints.insert.InsertUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InsertUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private InsertUserService insertUserService;

    @Test
    public void whenSaveUser_shouldReturnUser() {
        User user = new User();
        user.setName("Test Name");

        when(userRepository.save(ArgumentMatchers.any(User.class))).thenReturn(user);

        User created = insertUserService.insertUser(user);

        assertThat(created.getName()).isSameAs(user.getName());
        verify(userRepository).save(user);
    }
}