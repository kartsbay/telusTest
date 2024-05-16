package com.telusTest.api.controller;

import com.telusTest.api.model.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.telusTest.api.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoRestController {
    TodoService todoService;

    public TodoRestController( TodoService todoService){
        this.todoService = todoService;

    }

    @GetMapping("/todo/{id}")
    //@PreAuthorize("hasRole('USER')")
    ResponseEntity<Todo> getTodo(@PathVariable int id) {
        return new ResponseEntity<>(todoService.getTodo(id),HttpStatus.OK);
    }

    @GetMapping("/todo")
    ResponseEntity<List<Todo>> allTodo() {
        return new ResponseEntity<>(todoService.allTodo(),HttpStatus.OK);
    }

    @PostMapping("/todo")
    ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.addTodo(todo), HttpStatus.OK);
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
