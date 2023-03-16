import java.util.ArrayList;

public class Lists {
    public static void List() {
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
}
