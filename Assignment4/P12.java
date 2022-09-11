//Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional  value.

public class P12 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(2, 3);
        f1.display();
        f2.display();
        f3.display();
    }
}

class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

// Output:
// 0/1
// 1/2
// 2/3
