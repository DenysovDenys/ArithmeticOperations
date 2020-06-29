package com.arop.geometry.space;

import com.arop.geometry.vertex.Vertex3D;

import java.util.List;

public class SquarePyramid extends SpaceShape {

    private final double pyramidWidth;
    private final double height;


    public SquarePyramid(Vertex3D coordinates, double pyramidWight, double height) {
        super(List.of(coordinates), "Square Pyramid");
        this.pyramidWidth = pyramidWight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (4 * pyramidWidth) / 2 * ((pyramidWidth / (2 * Math.tan(Math.toRadians(180 / 4.0))))
                + Math.sqrt(Math.pow(height, 2) + (Math.pow(pyramidWidth / 2 * Math.tan(Math.toRadians(180 / 4.0)), 2))));
    }

    @Override
    public double getVolume() {
        return (height * 4 * Math.pow(pyramidWidth, 2)) / 12 * Math.tan(Math.toRadians(180 / 4.0));
    }
}
