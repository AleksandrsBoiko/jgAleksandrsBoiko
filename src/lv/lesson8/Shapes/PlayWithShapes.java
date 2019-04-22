package lv.lesson8.Shapes;

import java.util.Arrays;

public class PlayWithShapes {
    public static void main(String[] args) {

        Square square = new Square(10);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4,5,7);

        Shape[] myShapes = {square, circle, triangle};

        for (Shape shape : myShapes){
           // System.out.println(
           //         "======================" +
            //                shape);

           print(shape);
        }

        Arrays.stream(myShapes).forEach(shape -> print(shape));

        Arrays.stream(myShapes).forEach(System.out::println);

        Arrays.stream(myShapes).forEach(shape -> System.out.println(shape));

        }

    private static void print(Shape shape) {
        System.out.println("================" + shape) ;
    }


}

