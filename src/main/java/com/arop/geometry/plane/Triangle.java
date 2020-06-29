package com.arop.geometry.plane;

import com.arop.geometry.vertex.Vertex2D;

import java.util.List;

public class Triangle extends PlaneShape {

    private final double distanceAB;
    private final double distanceBC;
    private final double distanceCA;

    public Triangle(Vertex2D coordinatesA, Vertex2D coordinatesB, Vertex2D coordinatesC) {
        super(List.of(coordinatesA, coordinatesB, coordinatesC), "Triangle");
        this.distanceAB = getDistance(coordinatesA, coordinatesB);
        this.distanceBC = getDistance(coordinatesB, coordinatesC);
        this.distanceCA = getDistance(coordinatesC, coordinatesA);
    }

    @Override
    public double getArea() {
        double halfPerimeter = 0.5 * (distanceAB + distanceBC + distanceCA);
        return Math.sqrt(halfPerimeter * (halfPerimeter - distanceAB) * (halfPerimeter - distanceBC) * (halfPerimeter - distanceCA));
    }

    @Override
    public double getPerimeter() {
        return distanceAB + distanceBC + distanceCA;
    }
}
