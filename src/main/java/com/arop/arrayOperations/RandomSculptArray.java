package com.arop.arrayOperations;

import java.util.Random;

public class RandomSculptArray {
    private static Random rand = new Random();

    public static void outputReplacedDuplicate(int[] duplicateArray) {
        for (int i = duplicateArray.length - 1; i > 0; i--) {
            String str = String.valueOf(duplicateArray[i]);
            for (int j = 0; j < duplicateArray.length; j++) {
                String finalResult = String.valueOf(duplicateArray[j]);
                if (i != j) {
                    if (str.equals(finalResult)) {
                        duplicateArray[i] = 0;
                    }
                }
            }
        }
        for (int array : duplicateArray) {
            System.out.print(array);
        }
    }

    public static void outputArrayDiagonal(String[][] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i][i]);
        }
    }

    public static void outputReplacedArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomArray[i] * randomArray[i];
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void outputSum(int[] randomArray) {
        long sum = 0;
        for (int array : randomArray) {
            sum += array;
        }
        System.out.println("Summ = " + sum);
    }

    public static void outputSortBySelectionIncrease(int[] randomArray) {
        int lng = randomArray.length;
        for (int i = 0; i < lng; i++) {
            int minIdx = i;
            for (int j = i + 1; j < lng; j++) {
                if (randomArray[j] < randomArray[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = randomArray[minIdx];
            randomArray[minIdx] = randomArray[i];
            randomArray[i] = temp;
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void outputSortBySelectionDecrease(int[] randomArray) {
        int lng = randomArray.length;
        for (int i = 0; i < lng; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < lng; j++) {
                if (randomArray[j] > randomArray[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = randomArray[maxIdx];
            randomArray[maxIdx] = randomArray[i];
            randomArray[i] = temp;
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void outputMax(int[] randomArray) {
        int max = 0;
        for (int array : randomArray) {
            if (max < array) {
                max = array;
            }
        }
        System.out.println("Max value of mass = " + max);
    }

    public static void outputMin(int[] randomArray) {
        int min = randomArray[0];
        for (int array : randomArray) {
            if (min > array) {
                min = array;
            }
        }
        System.out.println("Min value of mass = " + min);
    }

    public static void setRandomArray(int[] randomArray, int maxNumOfRandom) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(maxNumOfRandom);
        }
    }
}