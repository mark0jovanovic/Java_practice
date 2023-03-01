public class TwoDimensionalArrayVezbe2 {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 11, 4}
        };
        for (int i = 0; i < 3; i++){
            int max = integers[i][0];
            for (int j = 1; j < 4; j++)
                max = (integers[i][j] > max) ? integers[i][j] : max;
            System.out.println("Maximal number of row " + (i + 1) +" is: " + max);
        }
        for (int i = 0; i < 3; i++)
            System.out.println("Row " + (i + 1) + " :" + getMax(integers[i]));
    }

    private static int getMax(int[] integers) {
        int max = integers[0];
        for (int i = 0; i < integers.length; i++)
            max = (max < integers[i]) ? integers[i] : max;
        return max;


    }
}
