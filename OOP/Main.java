package OOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Favour Junior";
        user.DOB = LocalDate.parse("2005-09-24");

        System.out.printf("%s was born back in %s and he is now %d years old\n", user.name, user.DOB,
                user.age());

    }
}
