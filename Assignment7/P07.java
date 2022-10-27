// Create 4 threads with priority 1,3,5,7 respectively.
// Update a counter in each of the threads for
// 10 ms. Print the final value of count for each thread.

public class P07 extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new P07());
        t1.setPriority(1);
        Thread t2 = new Thread(new P07());
        t2.setPriority(3);
        Thread t3 = new Thread(new P07());
        t3.setPriority(5);
        Thread t4 = new Thread(new P07());
        t4.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
