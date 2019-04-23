package lv.homework5;

public class BookTest {
    public static void main(String[] args) {
        //testBookTestToString();
        testBookEquals();
    }

   private static void testBookEquals() {
        Book EqulibriumB1 = new Book("J.Dexter", "Equlibrium", 485);
        Book EqulibriumB2 = new Book("J.Dexter", "Equlibrium", 485);
        boolean expectedEquals = true;

       System.out.println("Object equals true test");
       boolean actual = EqulibriumB1.equals(EqulibriumB2);
       if (actual) {
           System.out.println("PASSED");
       }
       else {
           System.out.println("FAILED");
           System.out.println("Expected: " + expectedEquals);
           System.out.println("Actual " + actual);
       }

   }

    private static void testCandyBoxToString() {
        Book book = new Book("J.Dexter","Equilibrium", 485);

        String expected = "Book { author: J.Dexter, title: Equlibrium, pageCount: 485}";

        if (expected.equals(book.toString())) {

            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println(expected);
            System.out.println(book.toString());
        }
    }

}
