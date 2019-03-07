package lv.homework4;

public class DogAgeCalculatorTest {

    public static void main(String[] args) {

        DogAgeCalculator dogAgeCalculator = new DogAgeCalculator();

        int actualResultHumanAgeToDogAge = dogAgeCalculator.humanAgeToDogAge(40);

        int expectedResultHumanageToDogAge = 6;

        int actualResultDogAgetoHumanAge = dogAgeCalculator.dogAgeToHumanAge(4);

        int expectedResultDogAgeToHumanAge = 32;

        System.out.println("Actual result Human Age to Dog Age: " + actualResultHumanAgeToDogAge);
        System.out.println("Expected result Human Age to Dog Age: " + expectedResultHumanageToDogAge);
        System.out.println("Actual result Dog Age to Human Age: " + actualResultDogAgetoHumanAge);
        System.out.println("Expected result Dog Age to Human Age: " + expectedResultDogAgeToHumanAge);
    }
}
