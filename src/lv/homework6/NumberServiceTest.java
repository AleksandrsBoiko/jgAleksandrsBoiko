package lv.homework6;

public class NumberServiceTest {

    public static void main(String[] args) {

        NumberService numberService = new NumberService();

        numberService.sumInRange(5,10);

        System.out.println("Sum In Range");
        System.out.println(" a = 5, b = 10 ");
        System.out.println("Sum = " + numberService.sum);

        numberService.sumInRange(15,8);

        System.out.println("Sum In Range");
        System.out.println(" a = 15, b = 8 ");
        System.out.println("Sum = " + numberService.sum);

        numberService.getEvenNumberCount(5,10);

        System.out.println(numberService.i);


    }
}
