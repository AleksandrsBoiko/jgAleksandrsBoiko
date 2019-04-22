package lesson9.bookstore;

public class Book {

    private String title;
    private String author;
    private Genre genre;


    @Override
    public String toString() {
        return genre.getValue() + " - " + title + " (" + author + ")";
    }



    public Book(Genre genre, String title, String author) {
        this.genre = genre;
        this.title = title;
        this.author = author;

    }

}
