// Write a java program to implement the yield() method in thread programming.

public class P03 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            Thread.yield();
            System.out.println("Thread started: " + Thread.currentThread().getName());
        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        P03 ob1 = new P03();
        ob1.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread started: " + Thread.currentThread().getName());
        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }
}

// OUTPUT
// Thread started: main
// Thread started: Thread-0
// Thread started: main
// Thread started: Thread-0
// Thread started: main
// Thread started: Thread-0
// Thread ended: main
// Thread ended: Thread-0