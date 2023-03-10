package OOP;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Favour Junior", "2005-09-24");

        System.out.printf("%s was born back in %s and he is now %d years old\n", user1.name, user1.DOB,
                user1.getAge());

        Book book = new Book();

        book.title = "The 48 Laws of Power";
        book.author = "Robert Greene";
        // book.copiesAvailable = 1000;
        // book.ISBN = "9788423991815";

        user1.borrowBook(book);

        System.out.printf("User %s has borrowed %s\n", user1.name, user1.books.toString());

    }
}
