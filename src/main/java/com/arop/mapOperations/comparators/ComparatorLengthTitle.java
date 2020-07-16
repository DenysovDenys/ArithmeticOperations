package com.arop.mapOperations.comparators;

import com.arop.mapOperations.family.Family;

import java.util.Comparator;

public class ComparatorLengthTitle implements Comparator<Family> {
    public int compare(Family f1, Family f2) {
        return f2.getTitle().compareTo(f1.getTitle());
    }
}
