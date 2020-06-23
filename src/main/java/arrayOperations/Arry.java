package arrayOperations;

import java.util.Random;

public class Arry {
    public static int[] randomArray = new int[20];
    public static String[][] stringArray = { {"orange ","apricot ", "coconut "}, {"pineapple ", "banana ", "grapefruit "}, {"mandarin ", "rambutan ", "pear "} };
    public static int[] duplicateArray = {3, 2, 3, 1, 4, 2, 8, 3};

    public static void replaceDuplicate(){
        for (int i = duplicateArray.length-1; i > 0; i--) {
            StringBuffer result = new StringBuffer();
            result.append(duplicateArray[i]);
            String res = result.toString();
            for (int j = 0; j < duplicateArray.length; j++) {
                StringBuffer esult = new StringBuffer();
                esult.append(duplicateArray[j]);
                String re = esult.toString();
                if (i != j) {
                    if (res.equals(re)) {
                        duplicateArray[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < duplicateArray.length; i++)
            System.out.print(duplicateArray[i]);
    }

    public static void massDiagonal(){
        for (int i = 0; i < stringArray.length; i++)
            System.out.print(stringArray[i][i]);
    }

    public static void massReplaced(){
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = randomArray[i] * randomArray[i];
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void sum(){
        long sum = 0;
        for (int i = 0; i < randomArray.length; i++){
            sum += randomArray[i];
        }
        System.out.println("Summ = " + sum);
    }

    public static void sortBySelectionIncrease(){
        int lng = randomArray.length;
        for (int i = 0; i < lng; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < lng; j++)
                if (randomArray[j] < randomArray[minIdx])
                    minIdx = j;

            int temp = randomArray[minIdx];
            randomArray[minIdx] = randomArray[i];
            randomArray[i] = temp;
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void sortBySelectionDecrease(){
        int lng = randomArray.length;
        for (int i = 0; i < lng; i++)
        {
            int maxIdx = i;
            for (int j = i + 1; j < lng; j++)
                if (randomArray[j] > randomArray[maxIdx])
                    maxIdx = j;

            int temp = randomArray[maxIdx];
            randomArray[maxIdx] = randomArray[i];
            randomArray[i] = temp;
            System.out.print(randomArray[i] + " ");
        }
    }

    public static void findMax(){
        int max = 0;
        for (int i = 0; i < randomArray.length; i++){
            if (max< randomArray[i])
                max = randomArray[i];
        }
        System.out.println("Max value of mass = " + max);
    }

    public static void findMin(){
        int min = randomArray[0];
        for (int i = 0; i < randomArray.length; i++){
            if (min> randomArray[i])
                min = randomArray[i];
        }
        System.out.println("Min value of mass = " + min);
    }

    public static void fillMass(){
        for (int i = 0; i < randomArray.length; i++)
            randomArray[i] = new Random().nextInt(10001);
    }
}
