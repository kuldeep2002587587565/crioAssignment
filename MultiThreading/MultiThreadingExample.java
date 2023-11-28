public class MultiThreadingExample {
    public static void main(String[] args) {
        Task t1 = new Task();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(t1);
            thread.start();
        }

        // running the main method
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread is running .");
        }
    }
}