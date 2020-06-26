package com.arop.classesOperations;

public class Circle {
    private double area;

    public Circle() {
    }

    public double getArea(double radius) {
        this.area = Math.PI * (radius * radius);
        return this.area;
    }
}
