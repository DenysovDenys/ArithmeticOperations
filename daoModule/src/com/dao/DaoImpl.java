package com.dao;

import com.user.User;

import java.util.HashMap;
import java.util.Map;

public class DaoImpl implements Dao {

    private static final Map<Integer, User> users = new HashMap<>();

    private static DaoImpl dao;

    private DaoImpl() {
        addUser(new User("Denys", "Denysov", 26, "denysdenysov@gmail.com"));
        addUser(new User("Davos", "Seaworth", 55, "davosseaworth@gmail.com"));
        addUser(new User("Stannis", "Baratheon", 24, "stannisbaratheon@gmail.com"));
    }

    public static DaoImpl getDao() {
        if (dao == null) {
            dao = new DaoImpl();
        }
        return dao;
    }

    @Override
    public Map<Integer, User> getAllUser() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void removeUser(int id) {
        users.remove(id);
    }

    @Override
    public void editUser(int idOld, User newUser) {
        User old = getUserById(idOld);
        if (!newUser.getName().equals("")) {
            old.setName(newUser.getName());
        }
        if (!newUser.getSecondName().equals("")) {
            old.setSecondName(newUser.getSecondName());
        }
        if (newUser.getAge() != 0) {
            old.setAge(newUser.getAge());
        }
        if (!newUser.getEmail().equals("")) {
            old.setEmail(newUser.getEmail());
        }
    }

    @Override
    public boolean checkKey(int key) {
        return users.containsKey(key);
    }
}
