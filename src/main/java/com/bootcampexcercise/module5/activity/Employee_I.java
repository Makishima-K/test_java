package com.bootcampexcercise.module5.activity;

// Employee_I extends Person_I
public class Employee_I extends Person_I {

    // Attributes
    private double salary;
    private String title;

    // Behavior

    // Default constructor
    public Employee_I() {
        System.out.println("I'm an Employee_I Constructor");
    }

    // Getter for double salary
    public double getSalary() {
        return salary;
    }

    // Setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for String title
    public String getTitle() {
        return title;
    }

    // Setter for String title
    public void setTitle(String title) {
        this.title = title;
    }
}
