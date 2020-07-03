package com.arop.geometry.vertex;

public class Vertex2D implements Vertex {
    private final double x;
    private final double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{x = " + x + ", y = " + y + "}";
    }
}
