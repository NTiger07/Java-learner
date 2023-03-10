package OOP;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Favour Junior", "2005-09-24");
        System.out.printf("%s was born back in %s and he is now %d years old\n",
                user1.getName(), user1.getDOB(),
                user1.getAge());

        Book book1 = new Book("The 48 Laws of Power", "Robert Greene", 270);
        Book book2 = new Book("The Art of Seduction", "Robert Greene", 250);
        user1.borrowBook(book1);
        user1.borrowBook(book2);
        System.out.printf("User %s has borrowed: %s", user1.getName(),
                user1.borrowedBooks());

        AudioBook audiobook1 = new AudioBook("The Holy Bible", "God", 36000);
        EBook ebook1 = new EBook("Cracking the Coding Interview", "Gayle McDowell", 708, "PDF");

        System.out.println(audiobook1.toString());
        System.out.println(ebook1.toString());

    }
}
