import java.util.Arrays;

public class TwoDimensionalArraysVezbe1 {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < 3; i++){
            int sum = 0;
            for (int j = 0; j < 4;j++)
                sum += integers[i][j];
            System.out.println("The sum of row " + (i +1) + ": " + sum);
        }
        for (int k = 0; k < 4; k++){
            int sum1 = 0;
            for (int z = 0; z < 3; z++)
                sum1 += integers[z][k];
            System.out.println("The sum of column " + (k + 1) + ": " + sum1);
        }
    }
}
