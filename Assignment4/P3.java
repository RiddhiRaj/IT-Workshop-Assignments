//implement single inheritance in java
public class P3 extends Employee {
    int bonus=10000;
    public static void main(String[] args) {
        P3 p = new P3();
        System.out.println("Salary is: "+p.salary);
        System.out.println("Bonus is: "+p.bonus);
    }
}
class Employee{
    float salary = 40000;
}

// Output: 
// Salary is: 40000.0
// Bonus is: 10000