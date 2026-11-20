package module10;

/**
 * Demonstrates the {@link Vehicle} interface by calling the methods of a {@link Bike} and a {@link Car}.
 *
 * @author Maksims Karnakovs
 */
public class InterfaceActivityClass {

    /**
     * Creates the activity class (not used, the class is run through {@link #main(String[])}).
     */
    public InterfaceActivityClass() {
    }

    /**
     * Entry point of the program.
     * Starts and stops a bike and then a car.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // 6.4.2 - Call bike methods
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("-----------------------------");

        // 6.4.3 - Call car methods
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
