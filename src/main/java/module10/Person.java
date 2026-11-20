package module10;

/**
 * Abstract base class that represents a person.
 * Stores the common attributes of every person (name and age)
 * and declares the {@link #introduce()} method that each subclass must implement.
 *
 * @author Maksims Karnakovs
 */
public abstract class Person {

    /** Name of the person. */
    private String name;

    /** Age of the person in years. */
    private int age;

    /**
     * Creates a person with no name and age 0.
     */
    public Person() {
    }

    /**
     * Creates a person with the given name and age.
     *
     * @param name the name of the person
     * @param age  the age of the person in years
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the person.
     *
     * @return the age of the person in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the new age of the person in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Prints an introduction of the person to the console.
     * Each subclass provides its own implementation.
     */
    public abstract void introduce();
}
