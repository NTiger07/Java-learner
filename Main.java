import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // dataTypes(null);
        // StringFormatingYMethods();
        // UserInput();
        // Conditionals();
        // Arrays();
        // ForLoops();
        // WhileLoops();
        // Lists();
        HashMap();
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

    public static void ForLoops() {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Sum of numbers in number Aray
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        System.out.println(sum);

        // Nested for loop to print multiplication table
        for (int number = 1; number <= 10; number++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d X %d = %d ", number, multiplier, number * multiplier);
            }
            System.out.println("\n");
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void WhileLoops() {
        int number = 1;
        while (number <= 10) {
            System.out.println("Wahala");
            number++;
        }
    }

    public static void Lists() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(numbers.get(0)); // get value at index
        numbers.set(2, Integer.valueOf(30));
        numbers.remove(2); // index as argument
        numbers.clear();
        numbers.remove(Integer.valueOf(4)); // actual value as argument
        System.out.println(numbers.size()); // length of list
        System.out.println(numbers.contains(Integer.valueOf(4)));

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println(numbers);
    }

    public static void HashMap() {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 77);
        examScores.put("English", 88);
        examScores.put("Computer", 67);
        examScores.put("Civic", 85);
        examScores.put("Chemistry", 64);

        examScores.putIfAbsent("Data P", 99);
        examScores.replace("Math", 43);

        System.out.println(examScores);
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(99));

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores);

    }
}