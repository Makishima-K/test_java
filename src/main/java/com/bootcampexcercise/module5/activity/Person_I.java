package com.bootcampexcercise.module5.activity;

public class Person_I {

    // Attributes
    private String name;
    private int age;

    // Behavior

    // Default constructor
    public Person_I() {
        System.out.println("I'm Person_I constructor");
    }

    // Parameterized constructor with variables name and age
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for String name
    public String getName() {
        return name;
    }

    // Setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for int age
    public int getAge() {
        return age;
    }

    // Setter for int age
    public void setAge(int age) {
        this.age = age;
    }
}
