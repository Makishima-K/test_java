package com.bootcampexcercise.module7.activity;

// 1 - Error found: catch (Exception e) was placed BEFORE catch (ArithmeticException a).
// ArithmeticException is a subclass of Exception, so the first catch already handles it
// and the second catch can never be reached. The compiler reports:
//     "error: exception ArithmeticException has already been caught"
// Fix: catch blocks must go from the most specific exception to the most general one.
public class ExceptionSequenceActivity {
    public static void main(String[] args) {
        // We need to create an object because our divide method is not static
        new ExceptionSequenceActivity().divide(10, 0);
    }

    void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException a) {
            // Specific exception first
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            // General exception last
            System.out.println("Exception!!!");
        }
    }
}
