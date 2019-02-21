package lv.homework1;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName(){
        return name;
    }

    public double getRegularPrice(){
        return regularPrice;
    }

    public double getDiscount(){
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice(){
       return regularPrice-regularPrice*discount/(double)100;


    }

    public void printInformation() {
        System.out.println("Product : name = " + name + " regular price = " + regularPrice + " discount = " + discount + " actual price = " + calculateActualPrice() + " EUR");
    }
}
