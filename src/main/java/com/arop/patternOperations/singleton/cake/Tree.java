package com.arop.patternOperations.singleton.cake;

public class Tree {
    private static Tree instance;
    private static String name;

    private Tree(String name) {
        Tree.name = name;
    }

    public String getName() {
        return Tree.name;
    }

    public static Tree getInstance(String name) {
        if (instance == null) {
            instance = new Tree(name);
        }
        return instance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}