package com.arop.mapOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExecuteManager {
    Family borodachenko = new Family("Borodachenko", 3, "Dukes", "Honor");
    Family derkach = new Family("Derkach", 2, "Barons", "Glaive");
    Family uspenko = new Family("Uspenko", 10, "Counts", "Horde");
    Family chinkichi = new Family("Chinkichi", 4, "Boyar", "Chick");
    ComparatorLengthNameOfEmblem comparatorLengthNameOfEmblem = new ComparatorLengthNameOfEmblem();
    ComparatorLengthTitle comparatorLengthTitle = new ComparatorLengthTitle();
    Map<Integer, Family> mapOfFamily = new HashMap<>();
    Map<Integer, Family> mapTree = new TreeMap<>(mapOfFamily);

    public void runProgram() {
        RepeatingElements.outputUnique("1,2,3,4,4,5");
        System.out.println();
        System.out.println("Comparable, two elements by name: " + borodachenko.compareTo(derkach));
        System.out.println("Comparator length name of emblem: " + comparatorLengthNameOfEmblem.compare(uspenko, chinkichi));
        System.out.println("Comparator length title: " + comparatorLengthTitle.compare(derkach, uspenko));
        mapOfFamily.put(3, borodachenko);
        mapOfFamily.put(4, derkach);
        mapOfFamily.put(1, uspenko);
        mapOfFamily.put(2, chinkichi);
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
