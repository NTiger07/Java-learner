import java.util.Scanner;
import java.util.Arrays;;

class Main {
    public static void main(String[] args) {
        // dataTypes(null);
        // StringFormatingYMethods();
        // UserInput();
        // Conditionals();
        Arrays();
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

    public static void Arrays() {
        // char vowels[] = new char[5];

        char vowels[] = { 'e', 'u', 'i', 'a', 'o' };
        // System.out.println(vowels.length);

        // To sort from only second value[1] to fourth value[3]
        int startingIndex = 1;
        int endingIndex = 4; // exclusive

        Arrays.sort(vowels, startingIndex, endingIndex);
        char key = 'i';

        // Binary Search
        Arrays.sort(vowels);
        int foundIndex = Arrays.binarySearch(vowels, key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundIndex);

        // Copying an Array
        int numbers[] = { 1, 2, 3, 4, 5 };

        // int copyOfNumbers[] = numbers; // reference type
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length); // non reference type

    }
}