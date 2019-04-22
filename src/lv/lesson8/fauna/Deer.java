package lv.lesson8.fauna;

public class Deer implements Animal{


    @Override
    public void eat() {
        System.out.println("Dear is eating");

    }

    @Override
    public void poop() {
        System.out.println("Dear is popping");

    }

    @Override
    public void sleep() {
        System.out.println("Dear is sleeping");

    }
}
