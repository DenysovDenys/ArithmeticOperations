package com.arop.geometry.space;

import com.arop.geometry.Shape;
import com.arop.geometry.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape {
    protected SpaceShape(List<Vertex> vertexList, String nameOfShape) {
        super(vertexList, nameOfShape);
    }
}
