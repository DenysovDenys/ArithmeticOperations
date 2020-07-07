package com.arop.arrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruits {
    private final List<String> listOfFruits = new ArrayList<>();

    public Fruits(String[] listOfFruits) {
        this.listOfFruits.addAll(Arrays.asList(listOfFruits));
    }

    public void replaceFruit(String fruitNeedReplaced, String replacedFruit) {
        int i = this.listOfFruits.indexOf(fruitNeedReplaced);
        if (i >= 0) {
            this.listOfFruits.set(i, replacedFruit);
            System.out.println("Replaced the value of list «" + fruitNeedReplaced + "» to «" + replacedFruit + "»: " + this.listOfFruits);
        } else
            System.out.println("Value not present");
    }
}
