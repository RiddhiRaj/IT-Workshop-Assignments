// Create 4 threads with priority 1,3,5,7 respectively. Update a counter in each of the threads for 10 milliseconds. Print the final value of count for each thread.

public class P07 extends Thread {
    static int count = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        P07 ob2 = new P07(); // Thread 1
        P07 ob3 = new P07(); // Thread 2
        P07 ob4 = new P07(); // Thread 3
        P07 ob1 = new P07(); // Thread 4

        ob1.setPriority(1); // set priority of thread 1
        ob2.setPriority(3);
        ob3.setPriority(5);
        ob4.setPriority(7);

        ob1.start(); // start thread 1
        ob2.start();
        ob3.start();
        ob4.start();

        ob1.join(); // wait for thread 1 to terminate
        ob2.join();
        ob3.join();
        ob4.join();

        System.out.println("Final Count: " + count);
    }
}

// Output:
// Final Count: 40