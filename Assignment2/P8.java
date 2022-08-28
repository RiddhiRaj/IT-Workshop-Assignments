//implement bufferedreader class
import java.io.*;
public class P8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        String s = br.readLine();
        System.out.println("The number is "+s);
    }
}
