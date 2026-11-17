package com.bootcampexcercise.module5.activity;

/**
 * @author disha.k.mehta
 * Activity 2
 */
// Shape class is abstract
public abstract class Shape {

    public String color;

    public Shape() {
    }

    // Abstract method calculateArea with return type double
    public abstract double calculateArea(double length, double breadth, double radius);

    // Abstract method calculatePerimeter with return type double
    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
