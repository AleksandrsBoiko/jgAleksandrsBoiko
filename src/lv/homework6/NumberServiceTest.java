package lv.homework6;

public class NumberServiceTest {

    public static void main(String[] args) {

        NumberService numberService = new NumberService();

        numberService.sumInRange(5,10);

        System.out.println("\n" + "Sum In Range");
        System.out.println(" a = 5, b = 10 ");
        System.out.println("Sum = " + numberService.sum);

        numberService.sumInRange(15,8);

        System.out.println("\n" + "Sum In Range");
        System.out.println(" a = 15, b = 8 ");
        System.out.println("Sum = " + numberService.sum);

        numberService.getEvenNumberCount(5,10);

        System.out.println("\n" + "Even number count");
        System.out.println(" a = 5, b = 10 ");
        System.out.println("Even number cout = " + numberService.evenNumberCount);

        System.out.println(numberService.evenNumberCount);

        numberService.getEvenNumberCount(15,7);

        System.out.println("\n" + "Even number count");
        System.out.println(" a = 15, b = 7 ");
        System.out.println("Even number cout = " + numberService.evenNumberCount);

        System.out.println(numberService.evenNumberCount);
    }
}
