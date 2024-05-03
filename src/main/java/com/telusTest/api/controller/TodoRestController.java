package com.telusTest.api.controller;

import com.telusTest.api.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.telusTest.api.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoRestController {
    TodoService todoService;

    @Autowired
    public TodoRestController( TodoService todoService){
        this.todoService = todoService;

    }

    @GetMapping("/todo/{id}")
    ResponseEntity<Todo> getTodo(@PathVariable int id) {
        return new ResponseEntity<>(todoService.getTodo(id),HttpStatus.OK);
    }

    @GetMapping("/todo")
    ResponseEntity<List<Todo>> allTodo() {
        return new ResponseEntity<>(todoService.allTodo(),HttpStatus.OK);
    }

    @PostMapping("/todo")
    Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("/todo/{id}")
    ResponseEntity<Todo> updateTodo(@RequestBody Todo todo, @PathVariable int id) {
        Todo updateTodo = todoService.updateTodo(todo, id);
        return new ResponseEntity<>(updateTodo ,HttpStatus.OK);
    }

    @DeleteMapping("/todo/{id}")
    ResponseEntity<String> deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>("Successfully deleted todo id: " +id ,HttpStatus.OK);
    }
}
