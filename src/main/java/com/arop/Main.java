package com.arop;

import arithmeticOperations.Arithmetic;
import arrayOperations.Arry;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Arry.fillMass();
        Arry.findMin();
        Arry.findMax();
        System.out.print("Mass increased: ");
        Arry.sortBySelectionIncrease();
        System.out.println();
        System.out.print("Mass decreased: ");
        Arry.sortBySelectionDecrease();
        System.out.println();
        Arry.sum();
        System.out.print("Replaced mass = ");
        Arry.massReplaced();
        System.out.println();
        System.out.print("Diagonal of mass = ");
        Arry.massDiagonal();
        System.out.println();
        System.out.print("Replaced Duplicate = ");
        Arry.replaceDuplicate();
    }

}
