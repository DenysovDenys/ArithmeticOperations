package com.arop;

import java.util.Random;

public class Main {

    public static int[] massOfRandom = new int[20];
    public static String[][] massOfString = { {"orange ","apricot ", "coconut "}, {"pineapple ", "banana ", "grapefruit "}, {"mandarin ", "rambutan ", "pear "} };
    public static int[] massDuplicate = {3, 2, 3, 1, 4, 2, 8, 3};

    public static void main(String[] args) {
        //HW1
        //calculate((byte) 1, (short) 2, 3, 4.0, 0.5f);

        //HW2
        fillMass();

        findMin();
        findMax();

        System.out.print("Mass increased: ");
        sortBySelectionIncrease();
        System.out.println();

        System.out.print("Mass decreased: ");
        sortBySelectionDecrease();
        System.out.println();

        sum();
        System.out.print("Replaced mass = ");
        massReplaced();
        System.out.println();

        System.out.print("Diagonal of mass = ");
        massDiagonal();
        System.out.println();

        System.out.print("Replaced Duplicate = ");
        replaceDuplicate();
    }

    public static void replaceDuplicate(){
        for (int i = massDuplicate.length-1; i > 0; i--) {
            StringBuffer result = new StringBuffer();
            result.append(massDuplicate[i]);
            String res = result.toString();
            for (int j = 0; j < massDuplicate.length; j++) {
                StringBuffer esult = new StringBuffer();
                esult.append(massDuplicate[j]);
                String re = esult.toString();
                if (i != j) {
                    if (res.equals(re)) {
                        massDuplicate[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < massDuplicate.length; i++)
            System.out.print(massDuplicate[i]);
    }

    public static void massDiagonal(){
        for (int i = 0; i < massOfString.length; i++)
            System.out.print(massOfString[i][i]);
    }

    public static void massReplaced(){
        for (int i = 0; i < massOfRandom.length; i++){
            massOfRandom[i] = massOfRandom[i] * massOfRandom[i];
            System.out.print(massOfRandom[i] + " ");
        }
    }

    public static void sum(){
        long sum = 0;
        for (int i = 0; i < massOfRandom.length; i++){
            sum += massOfRandom[i];
        }
        System.out.println("Summ = " + sum);
    }

    public static void sortBySelectionIncrease(){
        int n = massOfRandom.length;
        for (int i = 0; i < n; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (massOfRandom[j] < massOfRandom[minIdx])
                    minIdx = j;

            int temp = massOfRandom[minIdx];
            massOfRandom[minIdx] = massOfRandom[i];
            massOfRandom[i] = temp;
            System.out.print(massOfRandom[i] + " ");
        }
    }

    public static void sortBySelectionDecrease(){
        int n = massOfRandom.length;
        for (int i = 0; i < n; i++)
        {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++)
                if (massOfRandom[j] > massOfRandom[maxIdx])
                    maxIdx = j;

            int temp = massOfRandom[maxIdx];
            massOfRandom[maxIdx] = massOfRandom[i];
            massOfRandom[i] = temp;
            System.out.print(massOfRandom[i] + " ");
        }
    }

    public static void findMax(){
        int max = 0;
        for (int i = 0; i < massOfRandom.length; i++){
            if (max<massOfRandom[i])
                max = massOfRandom[i];
        }
        System.out.println("Max value of mass = " + max);
    }

    public static void findMin(){
        int min = massOfRandom[0];
        for (int i = 0; i < massOfRandom.length; i++){
            if (min>massOfRandom[i])
                min = massOfRandom[i];
        }
        System.out.println("Min value of mass = " + min);
    }

    public static void fillMass(){
        for (int i = 0; i < massOfRandom.length; i++)
            massOfRandom[i] = new Random().nextInt(10001);
    }

    public static void calculate(byte b, short sh, long l, double d, float f) {
        System.out.println(b + sh);
        System.out.println(d - f);
        System.out.println(l * b);
        System.out.println(l / sh);
    }
}
