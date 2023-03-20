package BroCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("I love you");

        MyGenericClass<Integer> integerArray = 1;
        MyGenericClass<Double> doubleArray = 3.14;
        MyGenericClass<Character> characterArray = '@';
        MyGenericClass<String> stringArray = "Hello";

        displayArray(integerArray);

    }

    static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.println(x);
        }
    }

}
