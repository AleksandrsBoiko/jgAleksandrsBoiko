package lesson8.fauna.Shapes;

public class Square extends  Shape implements Edgable{


    private final double sideLengts;

    public Square(double sideLengts) {
        this.sideLengts = sideLengts;
    }


    @Override
    public int edgeCount() {
        return 4;
    }

    @Override
    double area() {
        return Math.pow(sideLengts, 2);
    }

    @Override
    double perimeter() {
        return sideLengts * edgeCount();
    }
}
