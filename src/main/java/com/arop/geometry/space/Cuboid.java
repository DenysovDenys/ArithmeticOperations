package com.arop.geometry.space;

import com.arop.geometry.interfaces.AreaMeasurable;
import com.arop.geometry.interfaces.VolumeMeasurable;
import com.arop.geometry.vertex.Vertex3D;

import java.util.List;

public class Cuboid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {

    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertex3D coordinates, double width, double height, double depth) {
        super(List.of(coordinates), "Cuboid");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * ((width * height) + (height * depth) + (depth * width));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Volume: " + this.getVolume();
    }
}
