package com.arop.geometry.plane;

import com.arop.geometry.vertex.Vertex2D;

import java.util.List;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D coordinates, double radius) {
        super(List.of(coordinates), "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
