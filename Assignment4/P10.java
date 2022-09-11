import java.util.*;
public class P10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = s.nextDouble();
        Area a = new Area(r);
        System.out.println("Area of circle is " + a.area);
    }
}

class Area{
    double area;
    Area(double r){
        area = 3.14*r*r;
    }
}

// Output:
// Enter the radius
// 5
// Area of circle is 78.5
