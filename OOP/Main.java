package OOP;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Favour Junior", "2005-09-24");

        System.out.printf("%s was born back in %s and he is now %d years old\n", user1.getName(), user1.getDOB(),
                user1.getAge());

        Book book = new Book("The 48 Laws of Power", "Robert Greene", 270);

        user1.borrowBook(book);

        System.out.printf("User %s has borrowed: %s\n", user1.getName(), user1.borrowedBooks());

    }
}
