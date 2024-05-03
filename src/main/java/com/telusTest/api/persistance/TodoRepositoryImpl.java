package com.telusTest.api.persistance;

import com.telusTest.api.model.Todo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TodoRepositoryImpl implements TodoRepository{

    private final JdbcTemplate jdbcTemplate;

    public TodoRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Todo> findAll() {
        var sql = "SELECT * FROM todo";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Todo.class));
    }

    @Override
    public Todo findById(int id) {
        var sql = "SELECT * FROM todo WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new DataClassRowMapper<>(Todo.class), id);
    }

    @Override
    public Todo insert(Todo todo) {
        jdbcTemplate.update("INSERT INTO todo(description, completion_status) VALUES (?,?)", todo.getDescription(), todo.getCompletionStatus());
        return todo;
    }

    @Override
    public Todo replace(int id, Todo todo) {
        String sql = "UPDATE todo SET description = ?, completion_status = ? WHERE id = ?";
        jdbcTemplate.update(sql, todo.getDescription(), todo.getCompletionStatus(), id);
        return todo;
    }

    @Override
    public boolean removeById(int id) {
        String deleteSql = "DELETE FROM todo WHERE id = ?";
        try {
            jdbcTemplate.update(deleteSql, id);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
