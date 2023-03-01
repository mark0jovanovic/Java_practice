public class JavaArrays2dpart3 {
    public static void main(String[] args) {
        int[][] integers = getArray();
        printArray(integers);

    }
    public static int[][] getArray() {
        return new int[][] {{1, 2, 3}, {5, 6}, {7, 8, 9, 10}};
    }
    public static void printArray(int[][] intigers) {
        for (int i = 0; i < intigers.length; i++){
            for (int j = 0; j < intigers[i].length; j++)
                System.out.print(intigers[i][j] + " ");
            System.out.println();
        }
        //System.out.println();
    }
}
