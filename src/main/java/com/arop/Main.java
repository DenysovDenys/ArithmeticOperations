package com.arop;

import com.arop.arrayOperations.Fruits;
import com.arop.arrayOperations.SimilarElements;
import com.arop.arrayOperations.SortTreeSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimilarElements similarElements = new SimilarElements(new int[]{3, 9, 11, 18, 20, 22});
        similarElements.removeDivisibleNumbers();

        List<Integer> secSimilarElements = new ArrayList<>();
        secSimilarElements.add(3);
        secSimilarElements.add(11);
        secSimilarElements.add(18);
        similarElements.checkSimilarElements(secSimilarElements);

        String[] allFruits = {"banana", "Orange", "Apple", "Pear", "Tangerines", "Strawberry"};
        Fruits fruits = new Fruits(allFruits);
        fruits.replaceFruit();

        String[] allFruitsForError = {"banana", "Grapefruit", "Apple", "Pear", "Tangerines", "Strawberry"};
        Fruits fruitsForError = new Fruits(allFruitsForError);
        fruitsForError.replaceFruit();

        int[] numbersForTreeSet = {3, 22, 43, 18, 8, 11};
        SortTreeSet treeSet = new SortTreeSet(numbersForTreeSet);
        treeSet.sortElementsByDescend();
    }
}
