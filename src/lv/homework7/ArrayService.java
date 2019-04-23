package lv.homework7;

import java.util.Random;

public class ArrayService {

    public int[] createArray(int size) {

    return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
    Random randomGenerator = new Random();
        for(int i=0; i<array.length; i++){
        array[i]=randomGenerator.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int elementArray : array) {
            System.out.println(elementArray);
        }
    }

    public void sumInArray(int[] array){
        int sum = 0;

        for (int i =0; i < array.length; i++){
            sum += array[i];
        }

        System.out.println("Sum = " + sum);
    }



}

