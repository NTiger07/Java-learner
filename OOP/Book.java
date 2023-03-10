package OOP;

public class Book {
    public String title;
    public String author;
    // public String ISBN;
    // public int copiesAvailable;

    public String toString() {
        return String.format("%s by %s \n", this.title, this.author);
    }
}
