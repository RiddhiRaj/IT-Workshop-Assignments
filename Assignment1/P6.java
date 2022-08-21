//write a java program to calculate factorial value of a varible by taking input from the command line.
// Language: java

class P6
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
}
