package BroCode;

public class MyThread extends Thread {
    @Override
    public void run() {
        // if (this.isDaemon()) {
        // System.out.println("This is a daemon thread that is running");
        // } else {

        // System.out.println("This is a user thread that is running");
        // }

        for (int i = 10; i <= 10; i--) {
            System.out.println("Thread #1: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Thread #1 is finished");
        }
    }
}
