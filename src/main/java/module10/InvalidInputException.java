package module10;

/**
 * Custom checked exception thrown by {@link Calculator} when it receives input
 * that cannot be processed correctly.
 *
 * @author Maksims Karnakovs
 */
public class InvalidInputException extends Exception {

    /** Serialization version identifier. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a message and the original cause.
     *
     * @param message description of why the input is invalid
     * @param cause   the original exception that caused this one
     */
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
