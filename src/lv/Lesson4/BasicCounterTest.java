package lv.Lesson4;

import lesson5.BasicCounter;

public class BasicCounterTest {

    public static void main(String[] args) {

        BasicCounter counter = new BasicCounter();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCounter());

    }
}
