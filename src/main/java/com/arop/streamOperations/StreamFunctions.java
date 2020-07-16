package com.arop.streamOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {
    public static void outputOlderUsers(List<User> users, int age) {
        System.out.println("Users, who are older than " + age + ": ");
        users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void outputYoungerUsersFromCity(List<User> users, int age, String city) {
        System.out.println("Users, who are younger than " + age + " and from " + city + ": ");
        users.stream()
                .filter(user -> user.getAge() < age && user.getCity().equals(city))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void outputAverageAgeOfUsersFromCity(List<User> users, String city) {
        System.out.println("Average age of users, who are from " + city + ": ");
        System.out.println((users.stream()
                .filter(user -> user.getCity().equals(city))
                .mapToDouble(User::getAge).sum()) / (double) users.stream()
                .filter(user -> user.getCity().equals(city)).count());
    }

    public static void outputNumberUsersNotFromCity(List<User> users, String city) {
        System.out.println("How many users are not from " + city + ": ");
        System.out.println(users.stream()
                .filter(user -> !user.getCity().equals(city))
                .count());
    }

    public static void outputSortByAge(List<User> users, int countOfElements) {
        System.out.println("Sorted by age, first " + countOfElements + " elements: ");
        users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .limit(countOfElements)
                .forEach(System.out::println);
    }
}
