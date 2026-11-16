package sef.module2.activity;

public class NumToWords {

    public static void main(String[] args) {
        // Print text value of number 5
        System.out.println(numToWords(5));
    }

    // Converts a number from 1 to 10 into its text value using a switch statement
    public static String numToWords(int number) {
        String word;
        switch (number) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "Ten";
                break;
            default:
                word = "Number is out of range (1-10)";
                break;
        }
        return word;
    }
}
