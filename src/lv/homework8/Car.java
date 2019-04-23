package lv.homework8;

import java.util.Objects;

public class Car {


    protected String brand;
    protected String color;
    protected int year;
    protected int weight;

    public Car(String brand, String color, int year, int weight){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year &&
                weight == car.weight &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, year, weight);
    }


}
