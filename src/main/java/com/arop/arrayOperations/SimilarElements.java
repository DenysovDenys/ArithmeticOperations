package com.arop.arrayOperations;

import java.util.ArrayList;
import java.util.List;

public class SimilarElements {
    private List<Integer> similarElements = new ArrayList<>();

    public SimilarElements(int[] similarElements) {
        for (int i = 0; i < similarElements.length; i++) {
            this.similarElements.add(similarElements[i]);
        }
    }

    public void removeDivisibleNumbers() {
        this.similarElements.removeIf(i -> i % 3 == 0);
        System.out.println("Without numbers divisible by 3: " + this.similarElements);
    }
}
