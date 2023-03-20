package BroCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("I love you");

        Integer[] integerArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        displayArray(integerArray);

    }

    static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.println(x);
        }
    }

}
