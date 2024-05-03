package com.telusTest.api.configuration;

import com.telusTest.api.model.Todo;
import com.telusTest.api.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(1)
public class InitializeDBCmdLine implements CommandLineRunner{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS todo(" +
                "id INTEGER PRIMARY KEY   AUTOINCREMENT, description TEXT, completion_status TEXT)");

        jdbcTemplate.update("INSERT INTO todo(description, completion_status) VALUES (?,?)", "desc", "stat");

        List<Todo> todoLst = jdbcTemplate.query(
                "SELECT id, description, completion_status FROM todo",
                new BeanPropertyRowMapper(Todo.class));
        for (Todo tod : todoLst) {
            System.out.println(tod.getDescription() + tod.getCompletionStatus() + tod.getId());

        }
    }
}
