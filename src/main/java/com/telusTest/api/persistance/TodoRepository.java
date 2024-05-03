package com.telusTest.api.persistance;

import com.telusTest.api.model.Todo;

import java.util.List;

public interface TodoRepository {

    List<Todo> findAll();

    Todo findById(int id);

    Todo insert(Todo user);

    Todo replace(int id, Todo user);

    boolean removeById(int id);

}
