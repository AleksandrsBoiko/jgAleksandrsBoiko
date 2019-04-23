package lv.homework5;

import java.util.Objects;

public class Book {


    private String author;
    private String title;
    private int pageCount;

    Book (String author, String title, int pageCount){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;


    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book)o;
        return Objects.equals(this.author, book.author)
                && Objects.equals(this.title, book.title)
                && this.pageCount == book.pageCount;
    }

    @Override
    public String toString() {
        return "Book { author: " + author + ", title: " + title + "page count: " + pageCount + "}";
    }



}
