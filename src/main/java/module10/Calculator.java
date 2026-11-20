package module10;

/**
 * Simple calculator that performs addition, subtraction, division and multiplication.
 *
 * @author Maksims Karnakovs
 */
public class Calculator {

    /**
     * Creates a new calculator.
     */
    public Calculator() {
    }

    /**
     * Adds two whole numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two decimal numbers (overloaded version of {@link #add(int, int)}).
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first one.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference {@code a - b}
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides one whole number by another (integer division, the remainder is discarded).
     * Division by zero is handled inside the method: an error message is printed
     * and 0 is returned instead of stopping the program.
     *
     * @param dividend the number to be divided
     * @param divisor  the number to divide by
     * @return the quotient {@code dividend / divisor}, or 0 if {@code divisor} is 0
     */
    public int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero is not allowed");
            return 0;
        }
    }

    /**
     * Multiplies two whole numbers.
     * The input is invalid when the result does not fit into an {@code int}
     * (it is larger than {@link Integer#MAX_VALUE} or smaller than {@link Integer#MIN_VALUE}).
     *
     * @param a the first number
     * @param b the second number
     * @return the product of {@code a} and {@code b}
     * @throws InvalidInputException if the product is out of the {@code int} range
     */
    public int multiply(int a, int b) throws InvalidInputException {
        try {
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            throw new InvalidInputException(
                    "Invalid input: " + a + " * " + b + " is out of the int range", e);
        }
    }
}
