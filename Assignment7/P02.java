// Write a java program to create Thread by implementing the Runnable interface.

public class P02 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        P02 ob = new P02();
        Thread th = new Thread(ob);
        th.start();
    }
}

// OUTPUT
// Thread is running
