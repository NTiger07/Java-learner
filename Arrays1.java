import java.util.Arrays;

public class Arrays1 {
    public static void arrays() {
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
