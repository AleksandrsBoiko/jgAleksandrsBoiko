package lv.homework4;

public class SignComparatorTest {

    public static void main(String[] args) {

        SignComparatorTest test = new SignComparatorTest();

        test.shouldComparePositiveNumber();

        test.shouldCompareNegativeNumber();

        test.shouldCompareEqualToZero();
    }

    public void shouldComparePositiveNumber() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(11);

        compareResult(result.equals("Number is positive"), "shouldComparePositiveNumber");
    }

    public void shouldCompareNegativeNumber() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(-33);

        compareResult(result.equals("Number is negative"), "shouldCompareNegativeNumber");
    }

    public void shouldCompareEqualToZero() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(0);

        compareResult(result.equals("Number is equal to zero"), "shouldCompareEqualToZero");
    }

    void compareResult(boolean result, String testName) {

        if (result) {

            System.out.println(testName + "OK");

        } else {

            System.out.println(testName + "Fail");
        }
    }
}
