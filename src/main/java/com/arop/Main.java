package com.arop;

import com.arop.geometry.Shape;
import com.arop.geometry.plane.Circle;
import com.arop.geometry.plane.Rectangle;
import com.arop.geometry.plane.Triangle;
import com.arop.geometry.space.Cuboid;
import com.arop.geometry.space.Sphere;
import com.arop.geometry.space.SquarePyramid;
import com.arop.geometry.vertex.Vertex2D;
import com.arop.geometry.vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Vertex2D(1, 1), new Vertex2D(-5, 2), new Vertex2D(0, -4));
        Rectangle rectangle = new Rectangle(new Vertex2D(0, 10), 5, 5);
        Circle circle = new Circle(new Vertex2D(0, 0), 10);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(5, 5, 5), 5, 5);
        Cuboid cuboid = new Cuboid(new Vertex3D(7, 7, 7), 4, 10, 3);
        Sphere sphere = new Sphere(new Vertex3D(8, -5, 0), 9);
        Shape[] allShapes = {triangle, rectangle, circle, squarePyramid, cuboid, sphere};

        for (int i = 0; i < allShapes.length; i++) {
            System.out.println(allShapes[i]);
        }
    }
}
