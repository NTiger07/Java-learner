import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // dataTypes(null);
        // StringFormatingYMethods();
        UserInput();
    }

    public static void dataTypes(String[] args) {
        // Integer types
        byte aSingleByte = 100;
        short aSmallNumber = 20000;
        int anInteger = 2147454656;
        long aLargeNumber = 7757586773473434434L;

        // Decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

        // Booleans
        boolean isMessiTheGOAT = true;
        boolean isJavaEasy = false;

        // Characters
        char copyrightSymbol = '\u00A9';

        // String
        String myName = "Favour";

        System.out.print("This is the copyright symbol " + copyrightSymbol);
    }

    public static void StringFormatingYMethods() {
        String myName = "Favour"; // %s
        int age = 69; // %d
        String country = "Nigeria";
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.", myName, country, age);
        System.out.print(formattedString);

        // String methods
        String fullName = "Olaleru Favour";

        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.contains("Favour"));
        System.out.println(fullName.replace("Favour", "Oluwaseyi"));

    }

    public static void UserInput() {
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

    public static void Conditionals() {

    }
}