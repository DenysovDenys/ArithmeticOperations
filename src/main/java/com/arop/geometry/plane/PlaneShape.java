package com.arop.geometry.plane;

import com.arop.geometry.Shape;
import com.arop.geometry.interfaces.AreaMeasurable;
import com.arop.geometry.interfaces.PerimeterMeasurable;
import com.arop.geometry.vertex.Vertex;
import com.arop.geometry.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    protected PlaneShape(List<Vertex> vertexList, String nameOfShape) {
        super(vertexList, nameOfShape);
    }

    public static double getDistance(Vertex2D coordinateA, Vertex2D coordinateB) {
        return Math.sqrt(Math.pow(coordinateA.getX() - coordinateB.getX(), 2) + Math.pow(coordinateA.getY() - coordinateB.getY(), 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
