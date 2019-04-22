package lesson9.bookstore;

import java.util.List;
import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.print;

public class Bookstore {

    public static void main(String[] args) {

        List<Book> books = createBooks();
        print(books, "Unsorted list");
    }

    private static void print(List<Book> books, String message) {
        System.out.println("======" + message + "======");
        books.forEach(System.out::println);
        System.out.println("======================");
    }

    private static List<Book> createBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book(Genre.HORROR, "The female Persuasion", "Meg Wolitzer"));
        books.add(new Book(Genre.NOVEL, "True roots", "Kristian Cavallari"));
        books.add(new Book(Genre.DETECTIVE, "A day in the life", "r.h. Sin"));
        books.add(new Book(Genre.DRAMA, "She felt like cat", "Denis Pager"));
        books.add(new Book(Genre.NOVEL, "Ready player one", "Ernest Cline"));


        return  books;
    }
}
