package com.user;

import java.util.Objects;

public class User {

    private final int id;
    private static int counter = 1;
    private String name;
    private String secondName;
    private int age;
    private String email;

    public User(String name, String secondName, int age, String email) {
        this.id = counter++;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                secondName.equals(user.secondName) &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, age, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
