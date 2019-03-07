package lv.homework4;


public class SignComparator {

    public String compare(int number) {

        if (number > 0) {

            return "Number is positive";
        }

        if (number < 0) {

            return "Number is negative";
        }

        return "Number is equal to zero";


    }

}
