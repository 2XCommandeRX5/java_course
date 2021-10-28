package L11.threads;

public class ThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable printHello = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World! " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getState());
            }
        };

        Thread  firstThread = new Thread(printHello, "Second thread");
        System.out.println(firstThread.getState());
        firstThread.start();
        System.out.println(firstThread.getState());
        firstThread.join();

        System.out.println("Main thread finished");

    }
}
