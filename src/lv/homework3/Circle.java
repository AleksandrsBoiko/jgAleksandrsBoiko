package lv.homework3;

public class Circle {

    //visiem mainīgajiem jabūt "private"
    double radius;

    public double getRadius (){
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14*radius*radius;
    }
}
