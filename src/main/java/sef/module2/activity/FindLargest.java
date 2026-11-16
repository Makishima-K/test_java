package sef.module2.activity;

public class FindLargest {

    public static void main(String[] args) {
        // Given numbers
        int first = 34;
        int second = 57;

        // Use if-else to find the larger of the two numbers
        int largest;
        if (first > second) {
            largest = first;
        } else {
            largest = second;
        }

        // Print the result
        System.out.println("The larger of " + first + " and " + second + " is " + largest);
    }
}
