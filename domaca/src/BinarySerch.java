import java.util.Arrays;

public class BinarySerch {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1, 0, -1};
        Arrays.sort(numbers);// -1, 0, 1, 2, 3, 4, 5

        System.out.println(Arrays.binarySearch(numbers, 4));//5
        System.out.println(Arrays.binarySearch(numbers, 3));//4
        System.out.println(Arrays.binarySearch(numbers, -3));//-1
        System.out.println(Arrays.binarySearch(numbers, 6));//-8
        //

    }
}
