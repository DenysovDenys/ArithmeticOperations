package com.arop;

public class Main {
    public static void main(String[] args) {
        calculate((byte) 1, (short) 2, 3, 4.0, 0.5f);
    }

    public static void calculate(byte b, short sh, long l, double d, float f) {
        System.out.println(b + sh);
        System.out.println(d - f);
        System.out.println(l * b);
        System.out.println(l / sh);
    }
}
