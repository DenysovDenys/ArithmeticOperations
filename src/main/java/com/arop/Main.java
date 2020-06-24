package com.arop;

import classesOperations.Car;
import classesOperations.Circle;
import classesOperations.Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        System.out.println("Площадь круга равна: " + circle.getArea(sc.nextDouble()));

        Objects obj1 = new Objects();
        Objects obj2 = new Objects();
        Objects obj3 = new Objects();
        Objects obj4 = new Objects();
        System.out.println("Количество созданных объектов класса: " + Objects.count);

        Car car = new Car();
        car.turnOn();
        car.ride(50);
        car.ride(40);
        car.turnOff();
    }
}
