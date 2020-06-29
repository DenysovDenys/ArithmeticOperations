package com.arop.geometry;

import com.arop.geometry.vertex.Vertex;

import java.util.List;

public abstract class Shape {
    private final List<Vertex> vertexList;
    private final String name;

    protected Shape(List<Vertex> vertexList, String name) {
        this.vertexList = vertexList;
        this.name = name;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", Vertices: " + vertexList;
    }
}
