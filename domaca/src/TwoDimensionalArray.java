import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers;
        numbers = new int[5][3];
        System.out.println(numbers[0][0]);
        int[][] intigers = new int[2][2];//[[0,0], [0,0]]
        intigers[0][0] = 3; // [[3,0], [0,0]]
        intigers[0][1] = 5; // [[3,5], [0,0]]

        intigers[1][0] = 10; // [[3,5], [10,0]]
        intigers[1][1] = 2; // [[3,5], [10,2]]
    }
}
