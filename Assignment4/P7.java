public class P7 extends Vehicle{
    //method overriding in java
    public void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String args[]){
        P7 obj = new P7();
        obj.run();
    }
}
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

// Output:
// Bike is running safely