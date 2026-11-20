package module10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Unit tests for the {@link Calculator} class.
 *
 * @author Maksims Karnakovs
 */
public class CalculatorTest {

    /** Allowed difference when comparing decimal results. */
    private static final double DELTA = 0.0001;

    /** Calculator under test. */
    private Calculator calculator;

    /**
     * Creates a new calculator before each test.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Releases the calculator after each test.
     */
    @After
    public void tearDown() {
        calculator = null;
    }

    // ---------- add(int, int) ----------

    /**
     * Adds two positive whole numbers.
     */
    @Test
    public void testAddIntPositiveNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    /**
     * Adds two negative whole numbers.
     */
    @Test
    public void testAddIntNegativeNumbers() {
        assertEquals(-15, calculator.add(-10, -5));
    }

    // ---------- add(double, double) ----------

    /**
     * Adds two positive decimal numbers.
     */
    @Test
    public void testAddDoublePositiveNumbers() {
        assertEquals(4.0, calculator.add(1.5, 2.5), DELTA);
    }

    /**
     * Adds a negative and a positive decimal number.
     */
    @Test
    public void testAddDoubleNegativeAndPositive() {
        assertEquals(-1.25, calculator.add(-3.75, 2.5), DELTA);
    }

    // ---------- subtract ----------

    /**
     * Subtracts a smaller number from a bigger one.
     */
    @Test
    public void testSubtractPositiveResult() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    /**
     * Subtracts a bigger number from a smaller one.
     */
    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    // ---------- divide ----------

    /**
     * Divides numbers without a remainder.
     */
    @Test
    public void testDivideExact() {
        assertEquals(5, calculator.divide(10, 2));
    }

    /**
     * Integer division discards the remainder.
     */
    @Test
    public void testDivideWithRemainder() {
        assertEquals(3, calculator.divide(7, 2));
    }

    /**
     * Division by zero is caught inside the method: it returns 0 and prints an error message.
     */
    @Test
    public void testDivideByZeroIsHandled() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        try {
            assertEquals(0, calculator.divide(10, 0));
        } finally {
            System.setOut(originalOut);
        }
        assertTrue(output.toString().contains("Error: division by zero is not allowed"));
    }

    // ---------- multiply ----------

    /**
     * Multiplies two positive numbers.
     */
    @Test
    public void testMultiplyPositiveNumbers() {
        try {
            assertEquals(20, calculator.multiply(4, 5));
        } catch (InvalidInputException e) {
            fail("Valid input must not throw an exception: " + e.getMessage());
        }
    }

    /**
     * Multiplies a negative number by a positive one.
     */
    @Test
    public void testMultiplyNegativeNumber() {
        try {
            assertEquals(-12, calculator.multiply(-3, 4));
        } catch (InvalidInputException e) {
            fail("Valid input must not throw an exception: " + e.getMessage());
        }
    }

    /**
     * A product outside the int range must throw {@link InvalidInputException}.
     */
    @Test
    public void testMultiplyOutOfRangeThrowsInvalidInputException() {
        try {
            calculator.multiply(Integer.MAX_VALUE, 2);
            fail("InvalidInputException was expected");
        } catch (InvalidInputException e) {
            assertEquals("Invalid input: 2147483647 * 2 is out of the int range", e.getMessage());
            assertTrue(e.getCause() instanceof ArithmeticException);
        }
    }
}
