package lv.homework1;

public class CalculatorTest {
    public static void main(String[] args) {

    Calculator calculator = new Calculator();

    int sumResult = calculator.sum(11,13);
    int substractResult = calculator.subtract(4,80);
    int multuplyResult = calculator.multiply(14,7);
    double divideResult = calculator.divide(60,3);

    System.out.println("Sum Result: " + sumResult);
    System.out.println("Substract Result: " + substractResult);
    System.out.println("Multiply Result: " + multuplyResult);
    System.out.println("Divide Result: " + divideResult);

    }
}
