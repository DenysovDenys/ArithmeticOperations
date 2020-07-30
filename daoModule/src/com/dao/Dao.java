package com.dao;

import com.user.User;

import java.util.Map;

public interface Dao {
    Map<Integer, User> getAllUser();

    User getUserById(int id);

    void addUser(User user);

    void removeUser(int id);

    void editUser(int id, User newUser);

    boolean checkKey(int key);
}
