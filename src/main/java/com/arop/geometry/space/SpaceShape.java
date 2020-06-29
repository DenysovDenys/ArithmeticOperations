package com.arop.geometry.space;

import com.arop.geometry.Shape;
import com.arop.geometry.interfaces.AreaMeasurable;
import com.arop.geometry.interfaces.VolumeMeasurable;
import com.arop.geometry.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected SpaceShape(List<Vertex> vertexList, String nameOfShape) {
        super(vertexList, nameOfShape);
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Volume: " + this.getVolume();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
