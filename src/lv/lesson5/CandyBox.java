package lv.lesson5;

import java.util.Objects;

public class CandyBox {

    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    CandyBox (String name, int amount){
        this.name = name;
        this.amount = amount;


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox)o;
        return Objects.equals(this.name, candyBox.name)
                && this.amount == candyBox.amount;
    }

    public  int hashCode(){
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return "CandyBox { name: " + name + ", ammount: " + amount + "}";


    }

}
