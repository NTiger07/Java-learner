package BroCode;

public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setPriority(10);

        System.out.println(Thread.currentThread().getPriority());

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(2000);
        }

        System.out.println("You're done!");
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.start();
        System.out.println(thread2.isAlive());

        System.out.println(thread2.isDaemon());
    }
}
