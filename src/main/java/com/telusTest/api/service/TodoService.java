package com.telusTest.api.service;

import com.telusTest.api.model.Todo;
import com.telusTest.api.persistance.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Todo getTodo(int id) {
        return todoRepository.findById(id);
    }

    public List<Todo> allTodo() {
        return todoRepository.findAll();
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.insert(todo);
    }

    public Todo updateTodo(Todo todo, int id) {
        return todoRepository.replace(id, todo);
    }

    public boolean deleteTodo(int id) {
        return todoRepository.removeById(id);
    }


}
