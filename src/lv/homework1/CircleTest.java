package lv.homework1;

public class CircleTest {
    public static void main(String[] args) {

    Circle circle = new Circle();

    circle.radius = 10;
    circle.calculateArea();

    System.out.println("Circle area: " + circle.calculateArea());
    }
}
