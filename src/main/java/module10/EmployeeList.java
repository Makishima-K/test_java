package module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of employees and prints the name of the employee with the highest salary.
 *
 * @author Maksims Karnakovs
 */
public class EmployeeList {

    /**
     * Creates an employee list (not used, the class is run through {@link #main(String[])}).
     */
    public EmployeeList() {
    }

    /**
     * Entry point of the program.
     * Creates 5 employees, adds them to a list and prints the name of the highest paid one.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // 4.1 - Create 5 employee objects with job title, company and salary
        Employee emp1 = new Employee("Java Developer", "Accenture", 2500.0);
        Employee emp2 = new Employee("QA Engineer", "Accenture", 1900.0);
        Employee emp3 = new Employee("Team Lead", "Accenture", 4200.0);
        Employee emp4 = new Employee("Business Analyst", "Accenture", 3100.0);
        Employee emp5 = new Employee("Intern", "Accenture", 900.0);

        // Names are set through the inherited setter, so getHighestPaidEmp() can return them
        emp1.setName("John");
        emp2.setName("Mike");
        emp3.setName("Shanti");
        emp4.setName("Stacie");
        emp5.setName("Harry");

        // 4.2 - Create the list of employees and add all employee objects to it
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        // 4.4 - Print the name of the employee with the highest salary
        System.out.println("The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp(empList));
    }
}
