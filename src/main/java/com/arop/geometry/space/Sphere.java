package com.arop.geometry.space;

import com.arop.geometry.vertex.Vertex3D;

import java.util.List;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertex3D coordinates, double radius) {
        super(List.of(coordinates), "Sphere");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
