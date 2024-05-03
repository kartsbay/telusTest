package com.telusTest.api.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusTest.api.controller.TodoRestController;
import com.telusTest.api.service.TodoService;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import com.telusTest.api.model.Todo;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(controllers = TodoRestController.class)
@AutoConfigureMockMvc(addFilters = false)
@ActiveProfiles("test")
public class TodoControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private TodoService todoService;
    @MockBean
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    Todo todo;

    @BeforeEach
    public void init() {
        todo = new Todo(1, "desc", "compStat");
    }

    @Test
    public void TodoController_ReturnGet() throws Exception {
        given(todoService.getTodo(anyInt())).willAnswer((invocation -> {return todo;}));

        ResultActions response = mockMvc.perform(get("/api/todo/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(todo)));

        response.andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.jsonPath("$.description", CoreMatchers.is(todo.getDescription())));
    }

    @Test
    public void TodoController_ReturnCreated() throws Exception {
        given(todoService.getTodo(anyInt())).willAnswer((invocation -> {return todo;}));

        ResultActions response = mockMvc.perform(get("/api/todo/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(todo)));

        response.andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.jsonPath("$.description", CoreMatchers.is(todo.getDescription())));
    }
}
