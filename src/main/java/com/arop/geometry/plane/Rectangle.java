package com.arop.geometry.plane;

import com.arop.geometry.interfaces.AreaMeasurable;
import com.arop.geometry.interfaces.PerimeterMeasurable;
import com.arop.geometry.vertex.Vertex2D;

import java.util.List;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private final double width;
    private final double height;

    public Rectangle(Vertex2D coordinates, double width, double height) {
        super(List.of(coordinates), "Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }
}
