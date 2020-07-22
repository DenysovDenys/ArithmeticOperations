package com.arop.patternOperations.singleton.cake;

public class Tree {
    private static Tree instance;
    private static String name;

    private Tree(String name) {
        Tree.name = name;
    }

    public static String getName(){
        return Tree.name;
    }

    public static void getInstance(String name) {
        if (instance == null) {
            instance = new Tree(name);
        }
    }
}
