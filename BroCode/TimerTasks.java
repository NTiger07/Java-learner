package BroCode;

import java.util.*;

public class TimerTasks {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.printf("%d seconds remaining \n", counter);
                    counter--;
                } else {
                    System.out.printf("Happy new year!!!");
                    timer.cancel();
                }
            }

        };

        // timer.schedule(task, 2000);
        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}
