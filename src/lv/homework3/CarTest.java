package lv.homework3;

public class CarTest {
    public static void main(String[] args) {

     Car tesla = new Car();

     tesla.manufacturer = ("Tesla");    //jāizmanto setManufacturer()
     tesla.color = ("Grey");            //set metode jāizmanto
     tesla.year = (2017);               //set metode jāizmanto

     System.out.println("Car manufacturer: " + tesla.manufacturer); //get metode jāizmanto
     System.out.println("Car color: " + tesla.color);               //get metode jāizmanto
     System.out.println("Car produce year " + tesla.year);          //get metode jāizmanto
    }
}
