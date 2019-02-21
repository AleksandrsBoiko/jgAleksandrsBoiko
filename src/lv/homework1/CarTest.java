package lv.homework1;

public class CarTest {
    public static void main(String[] args) {

     Car tesla = new Car();

     tesla.manufacturer = ("Tesla");
     tesla.color = ("Grey");
     tesla.year = (2017);

     System.out.println("Car manufacturer: " + tesla.manufacturer);
     System.out.println("Car color: " + tesla.color);
     System.out.println("Car produce year " + tesla.year);
    }
}
