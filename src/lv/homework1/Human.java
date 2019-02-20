package lv.homework1;

public class Human {

    private String name;
    private int age;


    public String getName () { return this.name; }

    public void setName (String name) {this.name = name;}

    public int getAge () { return this.age;}

    public void setAge (int age) {this.age = age;}

    public void sayHi() {System.out.println("Hi, My name is " + name + ", I'm " + age + " years old");}

}
