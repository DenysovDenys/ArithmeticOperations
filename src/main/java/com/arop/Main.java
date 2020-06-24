package com.arop;

import arrayOperations.Arry;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        String[][] stringArray = {{"orange ", "apricot ", "coconut "}, {"pineapple ", "banana ", "grapefruit "}, {"mandarin ", "rambutan ", "pear "}};
        int[] duplicateArray = {3, 2, 3, 1, 4, 2, 8, 3};

        Arry.setRandomArray(randomArray);
        Arry.outMin(randomArray);
        Arry.outMax(randomArray);
        System.out.print("Mass increased: ");
        Arry.outSortBySelectionIncrease(randomArray);
        System.out.println();
        System.out.print("Mass decreased: ");
        Arry.outSortBySelectionDecrease(randomArray);
        System.out.println();
        Arry.outSum(randomArray);
        System.out.print("Replaced mass = ");
        Arry.outReplacedArray(randomArray);
        System.out.println();
        System.out.print("Diagonal of mass = ");
        Arry.outArrayDiagonal(stringArray);
        System.out.println();
        System.out.print("Replaced Duplicate = ");
        Arry.outReplacedDuplicate(duplicateArray);
    }

}
