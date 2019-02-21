package lv.homework1;

public class SquareCalculatorTest {

    public static void main(String[] args) {

    SquareCalculator calculator  = new SquareCalculator();

    int expectedResult = 225;

    int actualResullt = calculator.calculateSquare(15);

        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResullt);
    }
}
