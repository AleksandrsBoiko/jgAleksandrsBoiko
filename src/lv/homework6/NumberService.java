package lv.homework6;

public class NumberService {

    public int sum;
    public int i;

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
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    continue;
                }
            }
        }
         else{

                for (int i = a; i >= b; i--) {
                    if (i % 2 != 0) {
                        continue;
                    }
                }
            }


        return i;
    }
}
