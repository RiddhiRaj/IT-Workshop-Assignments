// Create 4 threads with priority 1,3,5,7 respectively. Update a counter in each of the threads for 10 milliseconds. Print the final value of count for each thread.

public class P07 extends Thread {
    static int count = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        P07 ob2 = new P07();
        P07 ob3 = new P07();
        P07 ob4 = new P07();
        P07 ob1 = new P07();

        ob1.setPriority(1);
        ob2.setPriority(3);
        ob3.setPriority(5);
        ob4.setPriority(7);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

        ob1.join();
        ob2.join();
        ob3.join();
        ob4.join();

        System.out.println("Final Count: " + count);
    }
}
