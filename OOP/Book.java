package OOP;

public class Book {
    private String title;
    private String author;
    // private String ISBN;
    // private int copiesAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        return String.format("%s by %s \n", this.title, this.author);
    }
}
