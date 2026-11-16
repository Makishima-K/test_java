package sef.module2.activity;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Print multiplication tables from 11 to 20
        for (int number = 11; number <= 20; number++) {
            System.out.println("Multiplication table of " + number + ":");

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }

            System.out.println();
        }
    }
}
