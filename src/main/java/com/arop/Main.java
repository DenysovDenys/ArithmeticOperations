package com.arop;

import arrayOperations.Arry;

public class Main {
    public static void main(String[] args) {
        Arry.setRandomArray();
        Arry.getMin();
        Arry.getMax();
        System.out.print("Mass increased: ");
        Arry.setSortBySelectionIncrease();
        System.out.println();
        System.out.print("Mass decreased: ");
        Arry.setSortBySelectionDecrease();
        System.out.println();
        Arry.setSum();
        System.out.print("Replaced mass = ");
        Arry.getReplacedArray();
        System.out.println();
        System.out.print("Diagonal of mass = ");
        Arry.getArrayDiagonal();
        System.out.println();
        System.out.print("Replaced Duplicate = ");
        Arry.getReplacedDuplicate();
    }

}
