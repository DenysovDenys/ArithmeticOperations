package com.arop.mapOperations;

public class Family implements Comparable<Family> {
    private final String name;
    private final int quantityMember;
    private final String title;
    private final String nameOfEmblem;


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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Family guest = (Family) obj;
        return name.equals(guest.name)
                && (quantityMember == guest.quantityMember)
                && (title.equals(guest.title))
                && (nameOfEmblem.equals(guest.nameOfEmblem));
    }
}
