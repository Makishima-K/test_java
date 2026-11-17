package sef.module6.activity;

public class InheritanceActivity {

    public static void main(String[] args) {
        // Object of the parent class
        Person_I person = new Person_I("John", "Smith", 40);
        System.out.println("--- Person ---");
        person.display();

        // Object of the child class: has the fields and methods of Person_I plus its own
        Employee_I employee = new Employee_I("Maksims", "Karnakovs", 21, "E1001", 2500.0);
        System.out.println("--- Employee ---");
        employee.display();

        // Inherited getter used on the child object
        System.out.println("Employee first name (inherited getter): " + employee.getFirstName());
    }
}
