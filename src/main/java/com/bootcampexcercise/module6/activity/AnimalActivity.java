package com.bootcampexcercise.module6.activity;

public class AnimalActivity {

    public static void main(String[] args) {

        // Create Mammal objects with a Cat and a Dog
        Mammal cat = new Mammal(new Cat());
        Mammal dog = new Mammal(new Dog());

        System.out.println("-----------------------------");
        cat.animalIsSpeaking();
        cat.animalIsSleeping();

        System.out.println("-----------------------------");
        dog.animalIsSpeaking();
        dog.animalIsSleeping();
    }
}
