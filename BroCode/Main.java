package BroCode;

public class Main {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-aid";
        String temp = "";

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
        // System.out.println(temp);
    }
}
