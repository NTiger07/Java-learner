package BroCode;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(3, 5, 4, 16));
    }

    static int sum(int a, int b) {
        System.out.println("Overloaded Method #1");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("Overloaded Method #2");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        System.out.println("Overloaded Method #2");
        return a + b + c + d;
    }

}
