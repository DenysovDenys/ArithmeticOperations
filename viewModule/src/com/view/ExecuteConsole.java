package com.view;

import com.dao.Dao;
import com.dao.DaoImpl;
import com.user.User;

public class ExecuteConsole extends Console {

    Dao dao = DaoImpl.getDao();

    @Override
    public void show() {
        System.out.println("Users in the list:\n");
        dao.getAllUser().values().forEach(System.out::println);
        System.out.println("\n1 - Add new user;  2 - Edit user;  3 - Remove user");

        while (true) {
            choice();
        }
    }

    @Override
    public void choice() {
        switch (select()) {
            case 1:
                addUserDialog();
                break;
            case 2:
                editUserDialog();
                break;
            case 3:
                removeUserDialog();
                break;
        }
    }

    private void removeUserDialog() {
        while (true) {
            System.out.println("Enter user ID you want to remove: ");
            int id = select();
            if (dao.checkKey(id)) {
                dao.removeUser(id);

                if (!dao.checkKey(id)) {
                    System.out.println("User successfully removed!");
                    show();
                    break;
                }
            } else {
                System.out.println("Wrong key!");
            }
        }
    }

    private void editUserDialog() {
        while (true) {
            System.out.println("Enter user ID you want to edit: ");
            int id = select();
            if (dao.checkKey(id)) {
                System.out.println("Enter name: ");
                String name = inputReader();
                System.out.println("Enter second name: ");
                String secondName = inputReader();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(inputReader());
                System.out.println("Enter email: ");
                String email = inputReader();

                User userEdited = new User(name, secondName, age, email);
                dao.editUser(id, userEdited);
                if (dao.getAllUser().containsValue(userEdited)) {
                    System.out.println("User " + userEdited.getName() + " successfully edited!");
                    show();
                    break;
                }
            } else {
                System.out.println("Wrong key!");
            }
        }
    }

    private void addUserDialog() {
        while (true) {
            System.out.println("Enter name: ");
            String name = inputReader();
            System.out.println("Enter second name: ");
            String secondName = inputReader();
            System.out.println("Enter age: ");
            int age = 0;
            while (age == 0 || age < 0) {
                age = parseAge(inputReader());
            }
            System.out.println("Enter email:");
            String email = inputReader();
            User newUser = new User(name, secondName, age, email);
            dao.addUser(newUser);

            if (dao.getAllUser().containsValue(newUser)) {
                System.out.println("User " + newUser.getName() + " was added!");
                show();
                break;
            } else {
                System.out.println("User adding error!");
            }
        }
    }

    private int parseAge(String input) {
        int age = 0;
        if (!isNumeric(input)) {
            System.out.println("Enter only numbers!");
        } else {
            age = Integer.parseInt(input);
        }
        return age;
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}