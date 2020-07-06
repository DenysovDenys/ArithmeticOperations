package com.arop.arrayOperations;

import java.util.TreeSet;

public class SortTreeSet {
    TreeSet<Integer> treeSet = new TreeSet<>();

    public SortTreeSet(int[] numbersForTreeSet) {
        for (int value : numbersForTreeSet) {
            this.treeSet.add(value);
        }
    }

    public void sortElementsByDescend() {
        System.out.println("Sorted set by descend: " + treeSet.descendingSet());
    }
}
