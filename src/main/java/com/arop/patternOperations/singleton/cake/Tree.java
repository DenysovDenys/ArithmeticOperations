package com.arop.patternOperations.singleton.cake;

public class Tree {
    private static Tree instance;
    public static String name;

    private Tree(String name) {
        Tree.name = name;
    }

    public static void getInstance(String name) {
        if (instance == null) {
            instance = new Tree(name);
        }
    }
}
