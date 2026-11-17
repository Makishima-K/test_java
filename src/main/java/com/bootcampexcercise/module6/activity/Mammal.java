package com.bootcampexcercise.module6.activity;

public class Mammal {

    // Attribute: any object that implements the Animal interface
    private Animal animal;

    // Parametrized constructor
    public Mammal(Animal animal) {
        this.animal = animal;
    }

    // Calls sleep() of the concrete animal (Cat, Dog, ...)
    public void animalIsSleeping() {
        animal.sleep();
    }

    // Calls animalSound() of the concrete animal (Cat, Dog, ...)
    public void animalIsSpeaking() {
        animal.animalSound();
    }
}
