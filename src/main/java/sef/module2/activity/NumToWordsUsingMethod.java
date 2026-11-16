package sef.module2.activity;

public class NumToWordsUsingMethod {

    public static void main(String[] args) {
        // Print text value of number 5 using the printWord() method
        printWord(5);
    }

    // Prints the text value of a number from 1 to 10
    public static void printWord(int number) {
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Number is out of range (1-10)");
                break;
        }
    }
}
