package com.arop.arrayOperations;

import java.util.ArrayList;
import java.util.List;

public class SimilarElements {
    private List<Integer> similarElements = new ArrayList<>();

    public SimilarElements(int[] similarElements) {
        for (int similarElement : similarElements) {
            this.similarElements.add(similarElement);
        }
    }

    public void removeDivisibleNumbers() {
        this.similarElements.removeIf(i -> i % 3 == 0);
        System.out.println("Without numbers divisible by 3: " + this.similarElements);
    }

    public void checkSimilarElements(List<Integer> secondSimilarElements) {
        this.similarElements.retainAll(secondSimilarElements);
        System.out.println("Similar elements of two lists: " + this.similarElements);
    }
}
