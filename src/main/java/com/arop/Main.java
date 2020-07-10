package com.arop;

import com.arop.mapOperations.ComparatorLengthNameOfEmblem;
import com.arop.mapOperations.ComparatorLengthTitle;
import com.arop.mapOperations.Family;
import com.arop.mapOperations.RepeatingElements;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        RepeatingElements.outputUnique();

        Family borodachenko = new Family("Borodachenko", 3, "Dukes", "Honor");
        Family derkach = new Family("Derkach", 2, "Barons", "Glaive");
        Family uspenko = new Family("Uspenko", 10, "Counts", "Horde");
        Family chinkichi = new Family("Chinkichi", 4, "Boyar", "Chick");

        System.out.println();

        Map<Integer, Family> mapOfFamily = new HashMap<>();
        mapOfFamily.put(3, borodachenko);
        mapOfFamily.put(4, derkach);
        mapOfFamily.put(1, uspenko);
        mapOfFamily.put(2, chinkichi);
        System.out.println("Comparable, two elements: " + borodachenko.compareTo(derkach));
        ComparatorLengthNameOfEmblem comparatorLengthNameOfEmblem = new ComparatorLengthNameOfEmblem();
        System.out.println("Comparator length name of emblem: " + comparatorLengthNameOfEmblem.compare(uspenko, chinkichi));
        ComparatorLengthTitle comparatorLengthTitle = new ComparatorLengthTitle();
        System.out.println("Comparator length title: " + comparatorLengthTitle.compare(derkach, uspenko));

        Map<Integer, Family> mapTree = new TreeMap<>(mapOfFamily);
        System.out.print("Collection sorted in natural order: ");
        for (Map.Entry<Integer, Family> entry : mapTree.entrySet()) {
            Integer key = entry.getKey();
            System.out.print(key);
        }

        System.out.println();

        System.out.println("Collection sorted by value: ");
        mapOfFamily.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}