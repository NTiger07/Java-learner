package BroCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int x = scanner.nextInt();

        System.out.print("Enter another whole number to divide by: ");
        int y = scanner.nextInt();

        try {
            System.out.println(String.format("Result: %d", x / y));
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!!");
        }

        scanner.close();
    }

}
