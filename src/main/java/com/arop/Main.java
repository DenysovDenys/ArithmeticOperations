package com.arop;

import com.arop.generics.HighestAndLowest;
import com.arop.generics.MyList;

public class Main {
    public static void main(String[] args) {
        MyList listOfIntegers = new MyList();
        listOfIntegers.Add(322);
        listOfIntegers.Add(54);
        listOfIntegers.Add(245);
        listOfIntegers.Add(654);
        listOfIntegers.Add(123);
        listOfIntegers.Add(746);
        listOfIntegers.Add(85);
        listOfIntegers.Add(15);
        System.out.println("Max of integers: " + listOfIntegers.GetMax());
        System.out.println("Min of integers: " + listOfIntegers.GetMin());
        MyList listOfStrings = new MyList();
        listOfStrings.Add("Hello!");
        listOfStrings.Add("How are you?");
        listOfStrings.Add("I'm fine, thanks.");
        System.out.println("Max of integers: " + listOfStrings.GetMax());
        System.out.println("Min of integers: " + listOfStrings.GetMin());

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
