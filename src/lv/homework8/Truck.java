package lv.homework8;

import java.util.Objects;

public class Truck extends Car {


    protected String engineClass;
    protected int maxAxleLoad;

    public Truck(String brand, String color, int year, int weight, String engineClass, int maxAxleLoad) {
        super(brand, color, year, weight);
        this.engineClass = engineClass;
        this.maxAxleLoad = maxAxleLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "engineClass='" + engineClass + '\'' +
                ", maxAxleLoad=" + maxAxleLoad +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxAxleLoad == truck.maxAxleLoad &&
                engineClass.equals(truck.engineClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineClass, maxAxleLoad);
    }

}
