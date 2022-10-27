//  Write a java program to implement the suspend() & resume() method in thread programming. 

public class P05 extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) throws Exception {
        P05 ob = new P05();
        ob.setName("Hello");
        ob.start();
        Thread.sleep(500);
        System.out.println("Thread Suspended");
        ob.suspend();
        System.out.println("Thread is going to sleep for 5 seconds");
        Thread.sleep(5000);
        System.out.println("Thread Resumed");
        ob.resume();
    }
}

// OUTPUT
// Thread 15 is running
// Thread Suspended
// Thread is going to sleep for 5 seconds
// Thread Resumed
