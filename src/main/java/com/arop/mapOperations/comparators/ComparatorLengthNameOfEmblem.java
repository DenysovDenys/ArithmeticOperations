package com.arop.mapOperations.comparators;

import com.arop.mapOperations.family.Family;

import java.util.Comparator;

public class ComparatorLengthNameOfEmblem implements Comparator<Family> {
    public int compare(Family f1, Family f2) {
        return f2.getNameOfEmblem().compareTo(f1.getNameOfEmblem());
    }
}
