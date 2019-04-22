package lv.lesson5;

public class CandyBoxTest {

    public static void main(String[] args) {
        testCandyBoxToString();
        testCandyBoxEquals();

    }

    private static void testCandyBoxEquals() {
        CandyBox prozitCB1 = new CandyBox("Prozit", 8);
        CandyBox prozitCB2 = new CandyBox("Prozit", 8);
        boolean expectedEquals = true;

        System.out.println("Object equals true test");
        boolean actual = prozitCB1.equals(prozitCB2);
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
        CandyBox candyBox = new CandyBox("Prozit", 8);

        String expected = "CandyBox { name: Prozit, ammount: 8}";

        if (expected.equals(candyBox.toString())) {

            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println(expected);
            System.out.println(candyBox.toString());
        }
    }
}
