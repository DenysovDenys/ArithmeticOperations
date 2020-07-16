package com.arop.exceptionOperations.division;

import java.util.Scanner;

public class SafeDivision {
    private final Scanner scanner = new Scanner(System.in);

    public void outputDivideException() {
        System.out.print("Enter first integer: ");
        int scann = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int zero = 0;
        double result = 0;

        while (zero == 0) {
            zero = scanner.nextInt();
            try {
                result = scann / zero;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("You can't divide by Zero.");
                System.out.print("Enter second number.");
            }
        }
        System.out.println("Division of two integers is " + result);
    }
}
