package com.arop.geometry.space;

import com.arop.geometry.interfaces.AreaMeasurable;
import com.arop.geometry.interfaces.VolumeMeasurable;
import com.arop.geometry.vertex.Vertex3D;

import java.util.List;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {

    private final double width;
    private final double height;


    public SquarePyramid(Vertex3D coordinates, double width, double height) {
        super(List.of(coordinates), "Square Pyramid");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (4 * width) / 2 * ((width / (2 * Math.tan(Math.toRadians(180 / 4.0))))
                + Math.sqrt(Math.pow(height, 2) + (Math.pow(width / 2 * Math.tan(Math.toRadians(180 / 4.0)), 2))));
    }

    @Override
    public double getVolume() {
        return (height * 4 * Math.pow(width, 2)) / 12 * Math.tan(Math.toRadians(180 / 4.0));
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Volume: " + this.getVolume();
    }
}
