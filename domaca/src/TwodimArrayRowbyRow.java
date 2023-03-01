import java.util.Arrays;

public class TwodimArrayRowbyRow {
    public static void main(String[] args) {
        int[][] intigers = {{3, 5, 7}, {10, 2, 9}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(intigers[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(intigers[j][i] + " ");
            System.out.println();
        }
        System.out.println(Arrays.toString(intigers));
        System.out.println(Arrays.deepToString(intigers));


    }
}
