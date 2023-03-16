package Basics;

import java.util.Scanner;

public class Conditionals {
    public static void conditionals() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Double number1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter another number: ");
        Double number2 = Double.parseDouble(scanner.nextLine());

        System.out.print("What operation do you want to perform?: ");
        String operation = scanner.nextLine();
        operation.toLowerCase();

        // Using Switch
        switch (operation) {
            default:
                System.out.printf(
                        "%s is not a supported operation, try addition, subtraction, multiplication or division",
                        operation);
                break;
            case "addition":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "subtraction":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "multiplication":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "division":
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                break;
        }

        // Using If, Else if and Else statements

        // if (operation.equals("addition")) {
        // System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        // } else if (operation.equals("subtraction")) {
        // System.out.printf("%f + %f = %f", number1, number2, number1 - number2);
        // } else if (operation.equals("multiplication")) {
        // System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        // } else if (operation.equals("division")) {
        // System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        // } else {
        // System.out.printf("%s is not a supported operation, try addition,
        // subtraction, multiplication or division",
        // operation);
        // }

        scanner.close();
    }
}
