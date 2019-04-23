package lv.homework7;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] array = service.create(10);

        service.fillArrayWithRandomNumbers(array);

        service.printArrayToConsole(array);
    }
}
