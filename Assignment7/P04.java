// Write a java program to implement the sleep(n) method in thread programming.

public class P04 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        P04 obj = new P04();
        obj.start();
    }
}

// OUTPUT
// 0
// 1
// 2
// 3
// 4