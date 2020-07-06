package com.arop;

import com.arop.arrayOperations.Fruits;
import com.arop.arrayOperations.SimilarElements;

public class Main {
    public static void main(String[] args) {
        SimilarElements similarElements = new SimilarElements(new int[]{3, 9, 11, 18, 20, 22});
        similarElements.removeDivisibleNumbers();

        String[] allFruits = {"banana", "Orange", "Apple", "Pear", "Tangerines", "Strawberry"};
        Fruits fruits = new Fruits(allFruits);
        fruits.replaceFruit();

        String[] allFruitsForError = {"banana", "Grapefruit", "Apple", "Pear", "Tangerines", "Strawberry"};
        Fruits fruitsForError = new Fruits(allFruitsForError);
        fruitsForError.replaceFruit();
    }
}
