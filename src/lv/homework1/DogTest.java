package lv.homework1;

import java.sql.SQLOutput;

public class DogTest {
    public static void main(String[] args) {
        Dog fluffy = new Dog();
        fluffy.setName("fluffy");
        fluffy.setColor("brown");
        fluffy.setAge(5);
        fluffy.eat();
        fluffy.sleep();
        fluffy.voice();

        System.out.println("My dog's name is " + fluffy.getName() );
        System.out.println(fluffy.getName() + "'s color is " + fluffy.getColor());
        System.out.println("And she is " + fluffy.getAge() + " years old.");


    }
}
