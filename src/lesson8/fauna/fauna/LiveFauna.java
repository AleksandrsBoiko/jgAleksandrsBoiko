package lesson8.fauna.fauna;

public class LiveFauna {

    public static void main(String[] args) {

        Deer rudolf = new Deer();
        Viper doge = new Viper();
        Salmon goldy = new Salmon();

        living(rudolf);
        living(doge);
        doge.droopSkin();
        living(goldy);
        goldy.swim();

    }

    private static void living(Animal animal) {
        animal.eat();
        animal.poop();
        animal.sleep();

        if (animal instanceof Fish ) {
            ((Fish)animal).swim();
        }


    }




}
