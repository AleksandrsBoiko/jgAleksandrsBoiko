package lv.homework3;

public class Car {

    //visiem mainīgajiem jabūt "private"
    String color;
    String manufacturer;
    int year;

    public String getColor(){
        return color;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getYear(){
        return year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setYear(int year){
        this.year = year;
    }
}
