package com.arop.mapOperations;


import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatingElements {
    public static void outputUnique(String arrayForRepeating) {
        for (Integer e : Arrays.stream(
                arrayForRepeating.replaceAll(" ", "")
                        .split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet())
        ) {
            System.out.print(e + " ");
        }
    }
}
