package com.bootcampexcercise.module5.activity;

public class Circle extends Shape {

    // Area of a circle = PI * radius^2 (length and breadth are not used)
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return Math.PI * radius * radius;
    }

    // Perimeter (circumference) of a circle = 2 * PI * radius (length and breadth are not used)
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * Math.PI * radius;
    }
}
