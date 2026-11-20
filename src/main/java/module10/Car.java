package module10;

/**
 * A car: a {@link Vehicle} that is started with the ignition key and stopped with the brake pedal.
 *
 * @author Maksims Karnakovs
 */
public class Car implements Vehicle {

    /**
     * Creates a new car.
     */
    public Car() {
    }

    /**
     * Starts the car by turning the ignition key.
     */
    @Override
    public void start() {
        System.out.println("Car starts: the driver turns the key and the engine runs");
    }

    /**
     * Stops the car with the brake pedal and turns the engine off.
     */
    @Override
    public void stop() {
        System.out.println("Car stops: the driver presses the brake pedal and turns the engine off");
    }
}
