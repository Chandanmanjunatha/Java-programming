//Multi-Threading
/*class MultiThreadDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Caught exception");
        }
    }
}

public class A20 {
    public static void main(String args[]) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThreadDemo m = new MultiThreadDemo();
            m.start();
        }
    }
}
*/

// Multi-Threading
class MultiThreadDemo extends Thread {
    private int number;

    // Constructor to initialize the thread with a specific number
    public MultiThreadDemo(int number) {
        this.number = number;
    }

    public void run() {
        try {
            System.out.println("Number: " + this.number);
        } catch (Exception e) {
            System.out.println("Caught exception");
        }
    }
}

public class MultiThread {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Create a new thread with the specific number to be printed
            MultiThreadDemo m = new MultiThreadDemo(i);
            m.start();
        }
    }
}
