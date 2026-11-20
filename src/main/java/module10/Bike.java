package module10;

/**
 * A bike: a {@link Vehicle} that is started by pedalling and stopped with hand brakes.
 *
 * @author Maksims Karnakovs
 */
public class Bike implements Vehicle {

    /**
     * Creates a new bike.
     */
    public Bike() {
    }

    /**
     * Starts the bike by pedalling.
     */
    @Override
    public void start() {
        System.out.println("Bike starts: the rider pushes the pedals and rides off");
    }

    /**
     * Stops the bike with the hand brakes.
     */
    @Override
    public void stop() {
        System.out.println("Bike stops: the rider squeezes the hand brakes");
    }
}
