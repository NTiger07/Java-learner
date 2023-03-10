package OOP;

public class AudioBook {
    private String title;
    private String author;
    private int length;

    AudioBook(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getLength() {
        return this.length;
    }
}
