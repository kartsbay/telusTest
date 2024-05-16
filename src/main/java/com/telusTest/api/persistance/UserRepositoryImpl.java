package com.telusTest.api.persistance;

import com.telusTest.api.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private final JdbcTemplate jdbcTemplate;
    public PasswordEncoder passwordEncoder;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate, PasswordEncoder passwordEncoder) {
        this.jdbcTemplate = jdbcTemplate;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> findAll() {
        var sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User findByName(String name) {
        var sql = "SELECT * FROM user WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new DataClassRowMapper<>(User.class), name);
    }

    @Override
    public User insert(User user) {
        jdbcTemplate.update("INSERT INTO user(name, password, role) VALUES (?,?,?)", user.getName(), passwordEncoder.encode(user.getPassword()), user.getRole());
        return user;
    }

    @Override
    public User replace(String name, User user) {
        String sql = "UPDATE user SET name = ?, role = ? WHERE name = ?";
        jdbcTemplate.update(sql, user.getName(), user.getRole(), name);
        return user;
    }

    @Override
    public boolean removeByName(String name) {
        String deleteSql = "DELETE FROM user WHERE name = ?";
        try {
            jdbcTemplate.update(deleteSql, name);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
