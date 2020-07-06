package com.arop;

import com.arop.generics.HighestAndLowest;
import com.arop.generics.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listOfIntegers = new MyList<>();
        listOfIntegers.add(322);
        listOfIntegers.add(54);
        listOfIntegers.add(245);
        listOfIntegers.add(654);
        listOfIntegers.add(123);
        listOfIntegers.add(746);
        listOfIntegers.add(85);
        listOfIntegers.add(15);
        System.out.println("Max of integers: " + listOfIntegers.getMax());
        System.out.println("Min of integers: " + listOfIntegers.getMin());
        MyList<String> listOfStrings = new MyList<>();
        listOfStrings.add("Hello!");
        listOfStrings.add("How are you?");
        listOfStrings.add("I'm fine, thanks.");
        System.out.println("Max of integers: " + listOfStrings.getMax());
        System.out.println("Min of integers: " + listOfStrings.getMin());

        Integer[] num = {534, 254, 32, 75, 977, 60, 275, 876, 91, 100};
        HighestAndLowest<Integer> numbers = new HighestAndLowest<>(num);
        System.out.println("Highest of integers: " + numbers.getMax());
        System.out.println("Lowest of integers: " + numbers.getMin());

        Double[] doubles = {-10.46, 3.14, 674.37, 35.12, -5.3, 36.6};
        HighestAndLowest<Double> doubles2 = new HighestAndLowest<>(doubles);
        System.out.println("Highest of double: " + doubles2.getMax());
        System.out.println("Lower of double: " + doubles2.getMin());

    }
}
