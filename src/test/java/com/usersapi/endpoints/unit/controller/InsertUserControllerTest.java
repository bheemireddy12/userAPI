package com.usersapi.endpoints.unit.controller;

import com.usersapi.domain.user.User;
import com.usersapi.endpoints.insert.InsertUserService;
import com.usersapi.endpoints.insert.InsertUserController;
import com.usersapi.endpoints.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(InsertUserController.class)
public class InsertUserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InsertUserService service;

    @Test
    public void insertUser_whenPostMethod() throws Exception {

        User user = new User();
        user.setName("Test Name");

        given(service.insertUser(user)).willReturn(user);

        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JsonUtil.toJson(user)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", is(user.getName())));
    }
}
