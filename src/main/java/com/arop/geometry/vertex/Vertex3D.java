package com.arop.geometry.vertex;

public class Vertex3D extends Vertex2D {

    public final double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{x = " + super.getX() + ", y = " + super.getY() + ", z = " + z + "}";
    }
}
