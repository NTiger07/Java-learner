package BroCode;

import java.util.Random;

public class GenRandom {
    public static void random(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1; // Generate a random value between 1 and 6 inclusive
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(z);
    }
}
