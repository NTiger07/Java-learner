public class StringFormatingYMethods {
    public static void stringFormatingYMethods() {
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
}
