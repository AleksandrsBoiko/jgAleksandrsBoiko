package lv.homework4;

public class DogAgeCalculatorTest {

    public static void main(String[] args) {

        DogAgeCalculator dogAgeCalculator = new DogAgeCalculator();

        int result = dogAgeCalculator.humanAgeToDogAge(40);

        int result2 = dogAgeCalculator.dogAgeToHumanAge(6);

        System.out.println(result);
        System.out.println(result2);
    }
}
