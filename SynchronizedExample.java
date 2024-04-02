public class SynchronizedExample {

    private static int number = 0;

    public synchronized static void printNumbers() {
        while (number < 50) {
            number += 5;
            System.out.print(number + " ");
            try {
                Thread.sleep(100); // Simulate some work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            printNumbers();
        });

        Thread t2 = new Thread(() -> {
            printNumbers();
        });

        t1.start();
        t2.start();
    }
}
