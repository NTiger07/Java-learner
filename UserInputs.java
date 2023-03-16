import java.util.Scanner;

public class UserInputs {
    public static void userInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! How old are you? : ", name);
        int age = scanner.nextInt();
        System.out.printf("%d is an excellent age to start learning Java!", age);

        // scanner.nextDouble();
        // scanner.nextBoolean();
        // scanner.nextFloat();

        scanner.close();

    }
}
