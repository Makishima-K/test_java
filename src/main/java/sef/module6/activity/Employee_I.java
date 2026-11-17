package sef.module6.activity;

// Child (sub) class: Employee_I inherits from Person_I
public class Employee_I extends Person_I {

    private String employeeId;
    private double salary;

    public Employee_I() {
        super();
    }

    public Employee_I(String firstName, String lastName, int age, String employeeId, double salary) {
        super(firstName, lastName, age); // call the parent constructor
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the parent method and extend it
    @Override
    public void display() {
        super.display(); // print name and age from Person_I
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
