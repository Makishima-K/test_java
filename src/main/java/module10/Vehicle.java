package module10;

/**
 * Represents a vehicle that can be started and stopped.
 * Every class that implements this interface provides its own behaviour.
 *
 * @author Maksims Karnakovs
 */
public interface Vehicle {

    /**
     * Starts the vehicle.
     */
    void start();

    /**
     * Stops the vehicle.
     */
    void stop();
}
