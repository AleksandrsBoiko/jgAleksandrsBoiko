package lesson10.bookrepository;

public class BookEntity {

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private long id;
    private String title;
    private String author;

    public BookEntity(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
