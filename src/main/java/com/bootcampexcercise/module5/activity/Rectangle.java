package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    // Area of a rectangle = length * breadth (radius is not used)
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return length * breadth;
    }

    // Perimeter of a rectangle = 2 * (length + breadth) (radius is not used)
    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}
