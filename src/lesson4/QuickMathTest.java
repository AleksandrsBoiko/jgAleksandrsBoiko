package lesson4;

public class QuickMathTest {

    public void shouldABeGreaterThanB(){

        QuickMath victim = new QuickMath();

        int a = 10;
        int b = 6;
        int expectedResult = 10;

        int actualResult = victim.max( a, b);

        if (actualResult == expectedResult) {
            System.out.println("Test shouldABeGreaterThanB has passed");
        } else {
            System.out.println("Test shouldABeGreaterThanB has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    public static void main(String[] args) {

        QuickMathTest test = new QuickMathTest();
        test.shouldABeGreaterThanB();
    }
}
