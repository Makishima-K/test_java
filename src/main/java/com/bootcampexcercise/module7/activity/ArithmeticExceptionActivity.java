package com.bootcampexcercise.module7.activity;

public class ArithmeticExceptionActivity {

    // 1 - main method
    public static void main(String[] args) {
        // 2 - Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);

        System.out.println("-----------------------------");

        // 5 - Call catchMe with 10 and 2 and see which messages get printed
        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        // 3 - Division by zero throws ArithmeticException, handle it
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide " + num1 + " by zero: " + e.getMessage());
        } finally {
            // 4 - Printed whether or not an exception occurred
            System.out.println("Thank you for using this program.");
        }
    }
}
