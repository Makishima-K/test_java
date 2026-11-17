package com.bootcampexcercise.module6.activity;

// Cat class implements Animal
public class Cat implements Animal {

    // Method animalSound() prints out string "Cat says: 'Meow Meow'!"
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    // Method sleep() prints out string "Cat is sleeping!"
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}
