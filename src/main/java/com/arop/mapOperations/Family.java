package com.arop.mapOperations;

public class Family implements Comparable<Family> {
    private final String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;


    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.nameOfEmblem = nameOfEmblem;
        this.quantityMember = quantityMember;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getName() {
        return this.name;
    }

    public String getNameOfEmblem() {
        return this.nameOfEmblem;
    }

    @Override
    public int compareTo(Family family) {
        return this.getName().compareTo(family.getName());
    }
}
