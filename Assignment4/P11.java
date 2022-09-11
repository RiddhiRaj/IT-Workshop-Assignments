
//Write a program to define a class Employee to accept emp_id, emp _name, basic_salary  from the user and display the gross_salary.

import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails();
        e.display();
    }
}

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee id");
        emp_id = s.nextInt();
        System.out.println("Enter the employee name");
        emp_name = s.next();
        System.out.println("Enter the basic salary");
        basic_salary = s.nextDouble();
    }

    void display() {
        System.out.println("Employee id: " + emp_id);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Basic salary: " + basic_salary);
        System.out.println("Gross salary: " + gross_salary);
    }
}

// Output:
// Enter the employee id
// 1
// Enter the employee name
// John
// Enter the basic salary
// 10000
// Employee id: 1
// Employee name: John
// Basic salary: 10000.0
// Gross salary: 0.0