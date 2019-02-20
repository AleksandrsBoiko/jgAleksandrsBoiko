package lv.homework1;

public class BookTest {
    public static void main(String[] args) {

        Book myBook = new Book();

        myBook.setAuthor("Steven King");
        myBook.setTitle("Hunger");
        myBook.setPageCount(332);
        myBook.setYear(1998);

        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Page Count: " + myBook.getPageCount());
        System.out.println("Year: " + myBook.getYear());
    }
}
