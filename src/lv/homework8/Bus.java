package lv.homework8;

import java.util.Objects;

public class Bus extends Car {

    protected int maxPassengers;

    public Bus(String brand, String color, int year, int weight, int maxPassengers) {
        super(brand, color, year, weight);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "maxPassengers=" + maxPassengers +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return maxPassengers == bus.maxPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxPassengers);
    }



}
