package BroCode;

public class Generics {
    public static void main(String[] args) {
        MyGenericClass<Integer> integerArray = new MyGenericClass<Integer>(1);
        MyGenericClass<Double> doubleArray = new MyGenericClass<Double>(3.14);
        MyGenericClass<Character> characterArray = new MyGenericClass<Character>('@');
        MyGenericClass<String> stringArray = new MyGenericClass<String>("Hello");

        System.out.println(integerArray.getValue());
        System.out.println(doubleArray.getValue());
        System.out.println(characterArray.getValue());
        System.out.println(stringArray.getValue());
    }
}
