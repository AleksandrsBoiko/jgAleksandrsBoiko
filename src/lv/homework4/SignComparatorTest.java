package lv.homework4;

public class SignComparatorTest {

    public static void main(String[] args) {

        SignComparatorTest test = new SignComparatorTest();

        test.shouldDetectPositiveNumber();

        test.shouldDetectNegativeNumber();

        test.shouldDetectEqualToZero();
    }

    public void shouldDetectPositiveNumber() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(11);

        compareResult(result.equals("Number is positive"), "shouldDetectPositiveNumber");
    }

    public void shouldDetectNegativeNumber() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(-33);

        compareResult(result.equals("Number is negative"), "shouldDetectNegativeNumber");
    }

    public void shouldDetectEqualToZero() {

        SignComparator comparator = new SignComparator();

        String result = comparator.compare(0);

        compareResult(result.equals("Number is equal to zero"), "shouldDetectEqualToZero");
    }

    void compareResult(boolean result, String testName) {

        if (result) {

            System.out.println(testName + "OK");

        } else {

            System.out.println(testName + "Fail");
        }
    }
}
