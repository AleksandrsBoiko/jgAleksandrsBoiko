package lv.homework3;

//OK
public class CircleTest {
    public static void main(String[] args) {

    Circle circle = new Circle();

    circle.radius = 10;  //jāizmanto setRadius() metode
    circle.calculateArea(); //nav nepieciešama, jo izrēķina laukumu, bet to nekur nepieglabā

    System.out.println("Circle area: " + circle.calculateArea());
    }
}
