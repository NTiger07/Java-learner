public class ForLoops {
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
}
