package com.bootcampexcercise.module7.activity;

// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

    // 1 - main method calls validateUser() with different names
    public static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();
        String[] namesToTest = {"John", "Stacie", "Alex"};

        for (String name : namesToTest) {
            System.out.println("Checking user: " + name);
            try {
                test.validateUser(name);
            } catch (CustomExceptionActivity e) {
                System.out.println(e.getMessage());
            }
            System.out.println("-----------------------------");
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            // 2 - Check if name is found in validUsers array and change flag's value accordingly
            if (validUsers[i].equals(name)) {
                flag = 1;
                break;
            }
        }

        // 3 - If flag is zero, throw CustomExceptionActivity exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            // 4 - Else if flag is one, print a welcome message
            System.out.println("Welcome to Payroll program");
        }
    }
}
