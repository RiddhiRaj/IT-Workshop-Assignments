//write a program to implement the static method in java
class P2
{
    public static void main(String[] args) {
        display();
        P2 p = new P2();
        p.show();
    }
    static void display()
    {
        System.out.println("Static method");
    }
    void show()
    {
        System.out.println("Non static method");
    }
}

//output
// Static method
// Non static method
