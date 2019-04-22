package lesson8.fauna.fauna;

class Viper implements Animal {

    @Override
    public void eat() {
        System.out.println("Viper is eating");

    }

    @Override
    public void poop() {
        System.out.println("Viper is pooping");

    }

    @Override
    public void sleep() {
        System.out.println("Viper is sleeping");

    }

    public void droopSkin(){
        System.out.println("Viper is dropping the skin");
    }
}
