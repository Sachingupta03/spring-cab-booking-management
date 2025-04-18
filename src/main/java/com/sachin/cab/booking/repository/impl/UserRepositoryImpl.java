package com.sachin.cab.booking.repository.impl;

import com.sachin.cab.booking.model.User;
import com.sachin.cab.booking.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> userList = new ArrayList<> ();

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public User findById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(int id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
