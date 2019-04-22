package lesson5;

public class BasicCounter {

    private int counter;

    public BasicCounter() {
        clear();
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public void clear() {
        counter = 0;
    }
}
