package com.telusTest.api.persistance;

import com.telusTest.api.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findByName(String name);

    User insert(User user);

    User replace(String name, User user);

    boolean removeByName(String name);
}
