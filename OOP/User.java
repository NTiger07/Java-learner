package OOP;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate DOB;
    public ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String DOB) {
        this.name = name;
        this.DOB = LocalDate.parse(DOB);
    }

    public String getName() {
        return this.name;
    }

    public String getDOB() {
        return this.DOB.toString();
    }

    public int getAge() {
        Period age = Period.between(this.DOB, LocalDate.now());
        return age.getYears();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

}
