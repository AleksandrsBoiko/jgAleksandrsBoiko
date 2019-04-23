package lv.homework6;

public class NumberService {

    public int sum;
    public int evenNumberCount;


    public int sumInRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum = i + sum;
            }

        } else {
            for (int i = a; i >= b; i--) {
                sum = i + sum;
            }
        }

        return sum;
    }


    public int getEvenNumberCount(int a, int b) {
        evenNumberCount = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    continue;
                }
                evenNumberCount = evenNumberCount+1;
            }

        }
         else{
                evenNumberCount = 0;
                for (int i = a; i >= b; i--) {
                    if (i % 2 != 0) {
                        continue;
                    }
                    evenNumberCount = evenNumberCount+1;
                }
            }


        return evenNumberCount;

    }
}
