package com.arop.streamOperations;

import java.util.Arrays;
import java.util.List;

public class ExecuteManager {
    public void runProgram() {
        List<User> users = Arrays.asList(
                new User("Basil", 16, "Dnipro"),
                new User("Peter", 23, "Dnipro"),
                new User("Elena", 42, "Lutsk"),
                new User("Elena", 92, "Chernihiv"),
                new User("Sergii", 5, "Kiev"),
                new User("Marina", 32, "Kiev"),
                new User("Ivan Ivanovich", 69, "Lviv"));
        StreamFunctions.outputOlderUsers(users, 40);
        System.out.println();
        StreamFunctions.outputYoungerUsersFromCity(users, 50, "Dnipro");
        System.out.println();
        StreamFunctions.outputAverageAgeOfUsersFromCity(users, "Lviv");
        System.out.println();
        StreamFunctions.outputNumberUsersNotFromCity(users, "Kiev");
        System.out.println();
        StreamFunctions.outputSortByAge(users, 3);
    }
}
