package OOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Favour Junior";
        youngerUser.DOB = LocalDate.parse("2005-09-24");

        System.out.printf("%s was born back in %s", youngerUser.name, youngerUser.DOB);
    }
}
