package com.bootcampexcercise.module6.activity;

// Dog class implements Animal
public class Dog implements Animal {

    // Method animalSound() prints out string "Dog says: 'Wuf Wuf'!"
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'Wuf Wuf'!");
    }

    // Method sleep() prints out string "Dog is sleeping!"
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
