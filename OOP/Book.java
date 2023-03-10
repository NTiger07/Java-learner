package OOP;

public class Book {
    private String title;
    private String author;
    // private String ISBN;
    // private int copiesAvailable;

    public String toString() {
        return String.format("%s by %s \n", this.title, this.author);
    }
}
