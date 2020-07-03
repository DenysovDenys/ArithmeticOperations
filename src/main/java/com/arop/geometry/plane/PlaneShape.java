package com.arop.geometry.plane;

import com.arop.geometry.Shape;
import com.arop.geometry.vertex.Vertex;
import com.arop.geometry.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape {

    protected PlaneShape(List<Vertex> vertexList, String nameOfShape) {
        super(vertexList, nameOfShape);
    }

    public static double getDistance(Vertex2D coordinateA, Vertex2D coordinateB) {
        return Math.sqrt(Math.pow(coordinateA.getX() - coordinateB.getX(), 2) + Math.pow(coordinateA.getY() - coordinateB.getY(), 2));
    }
}
