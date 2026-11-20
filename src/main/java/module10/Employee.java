package module10;

import java.util.List;

/**
 * Represents an employee: a {@link Person} who works at a company.
 * Adds the job title, company name and salary to the attributes of a person.
 *
 * @author Maksims Karnakovs
 */
public class Employee extends Person {

    /** Job title of the employee. */
    private String jobTitle;

    /** Name of the company where the employee works. */
    private String company;

    /** Salary of the employee. */
    private double salary;

    /**
     * Creates an employee with no data set.
     */
    public Employee() {
        super();
    }

    /**
     * Creates an employee with only the personal data set.
     *
     * @param name the name of the employee
     * @param age  the age of the employee in years
     */
    public Employee(String name, int age) {
        super(name, age);
    }

    /**
     * Creates an employee with only the job data set.
     *
     * @param jobTitle the job title of the employee
     * @param company  the company where the employee works
     * @param salary   the salary of the employee
     */
    public Employee(String jobTitle, String company, double salary) {
        super();
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Creates an employee with all data set.
     *
     * @param name     the name of the employee
     * @param age      the age of the employee in years
     * @param jobTitle the job title of the employee
     * @param company  the company where the employee works
     * @param salary   the salary of the employee
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Returns the job title of the employee.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the job title of the employee.
     *
     * @param jobTitle the new job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Returns the company where the employee works.
     *
     * @return the company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company where the employee works.
     *
     * @param company the new company name
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Returns the salary of the employee.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary the new salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Finds the employee with the highest salary in the given list and returns his or her name.
     * If several employees share the highest salary, the first one in the list is chosen.
     *
     * @param empList the list of employees to search
     * @return the name of the highest paid employee, or {@code null} if the list is {@code null} or empty
     */
    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return null;
        }

        Employee highestPaid = empList.get(0);
        for (Employee employee : empList) {
            if (employee.getSalary() > highestPaid.getSalary()) {
                highestPaid = employee;
            }
        }
        return highestPaid.getName();
    }

    /**
     * Prints an introduction of the employee to the console:
     * name and age on the first line, job title, company and salary on the second line.
     */
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
}
