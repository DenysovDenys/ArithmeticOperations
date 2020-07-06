package com.arop.arrayOperations;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> listOfFruits = new ArrayList<>();

    public Fruits(String[] listOfFruits) {
        for (int i = 0; i < listOfFruits.length; i++) {
            this.listOfFruits.add(listOfFruits[i]);
        }
    }

    public void replaceFruit() {
        int i = this.listOfFruits.indexOf("Orange");
        if (i >= 0) {
            this.listOfFruits.set(i, "Grapefruit");
            System.out.println("Replaced the value of list «Orange» to «Grapefruit»: " + this.listOfFruits);
        } else
            System.out.println("Value not present");
    }
}
