package lesson7;

public class PlayWithArrays2D {
    public static void main(String[] args) {

        int[][] array2D = new int[][] {
                {1, 5, 4},
                {3, 6, 9, 0, 1},
                {2, 8, 3, 5},


        };

        //int[][] array2Dz = new int[5][5];

        print(array2D);
    }

    private static void print(int [][] array2D) {

        for(int i=0; i<array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void printForEach(int[][] array2D) {

        int[][] numbers = {
                {1, 3, 5, 7},
                {2, 6, 9, 7, 8},
                {3, 6, 4}
        };

        for (int[] nums : numbers) {
            System.out.print(nums);
        }
    }

}
