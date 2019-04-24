package lv.homework8;

public class CarTest {
    public static void main(String[] args) {

        Truck volvo = new Truck("Volvo", "Blue", 2008, 8650, "Euro4", 850);
        Bus neoplan = new Bus("Neoplan", "Yellow", 2010, 6950, 89);
        PersonalCar toyota = new PersonalCar("Toyota", "Grey", 2015, 1250, "Rav4", "Diesel");

        System.out.println(volvo);
        System.out.println(neoplan);
        System.out.println(toyota);

    }
}
