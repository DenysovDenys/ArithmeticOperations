package com.arop;

import com.arop.classesOperations.Car;
import com.arop.classesOperations.Circle;
import com.arop.classesOperations.Objects;

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
        int speed = 50;
        car.ride(speed);
        speed = 40;
        car.ride(speed);
        car.turnOff();
    }
}
