package lv.homework8;

import java.util.Objects;

public class PersonalCar extends Car {


    protected String model;
    protected String fuelType;

    public PersonalCar(String brand, String color, int year, int weight, String model, String fuelType) {
        super(brand, color, year, weight);
        this.model = model;
        this.fuelType = fuelType;


    }

    @Override
    public String toString() {
        return "PersonalCar{" +
                "model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalCar)) return false;
        if (!super.equals(o)) return false;
        PersonalCar that = (PersonalCar) o;
        return Objects.equals(model, that.model) &&
                Objects.equals(fuelType, that.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, fuelType);
    }


}
