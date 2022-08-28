//armstrong number or not
import java.util.*;
public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n>0) {
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum==temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }    
    }
}
