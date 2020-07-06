package com.arop;

import com.arop.arrayOperations.SimilarElements;

public class Main {
    public static void main(String[] args) {
        SimilarElements similarElements = new SimilarElements(new int[]{3, 9, 11, 18, 20, 22});
        similarElements.removeDivisibleNumbers();
    }
}
