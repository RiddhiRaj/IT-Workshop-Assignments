//binary to decimal and decumal to binary
import java.util.*;
public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = sc.nextInt();
        int dec = 0;
        int p = 0;
        while(n>0) {
            int rem = n%10;
            dec = dec + rem*(int)Math.pow(2,p);
            n = n/10;
            p++;
        }
        System.out.println("Decimal number is "+dec);

        System.out.println("Enter a decimal number");
        int n1 = sc.nextInt();
        int bin = 0;
        int p1 = 0;
        while(n1>0) {
            int rem = n1%2;
            bin = bin + rem*(int)Math.pow(10,p1);
            n1 = n1/2;
            p1++;
        }
        System.out.println("Binary number is "+bin);
        
    }
}
