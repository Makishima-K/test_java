package sef.module6.activity;

// Parent (super) class
public class Person_I {

    private String firstName;
    private String lastName;
    private int age;

    public Person_I() {
    }

    public Person_I(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
