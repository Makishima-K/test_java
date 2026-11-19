package com.bootcampexcercise.module7.activity;

// The following program, when run, results in an exception.
// 1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed.

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            // Custom user friendly message
            System.out.println("Oops! Tried to access an element outside the array (size " + arr.length + "): " + e.getMessage());
        } finally {
            // This message gets printed out whether or not an error has occurred
            System.out.println("This should get printed even if there is an exception");
        }
    }
}
