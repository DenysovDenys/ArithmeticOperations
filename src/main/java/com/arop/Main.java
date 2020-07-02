package com.arop;

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
    }
}
