import java.lang.reflect.Array;
import java.util.Scanner;

public class SingleDimensionalArrays {
    public static void main(String[] args) {
//        String text;//null
//        text = "some text";
//        dataType[] arrayName;
//        arrayName = new dataType[10]; // address of the 10 elements of type datatype
        int[] numbers = new int[20];
        int[] numbers1 = new int[5];// {0, 0, 0, 0, 0}
        numbers1[0] = 5; // {5, 0, 0, 0, 0}
        numbers1[2] = 8; // {5, 0, 8, 0, 0}
        numbers1[4] = 10;
        double[] numbers2 = {1.9, 2.9, 3.4, 3.5};

        System.out.println(numbers2[0]);

        System.out.println(numbers2[1]);

        System.out.println(numbers2[2]);
        System.out.println(numbers1);//adresa arreya ne vrednosti za vrednosti
        for (int i = 0; i < numbers1.length; i++)
            System.out.print(numbers1[i] + " ");
//        new Scanner(System.in).nextDouble();
//        Array printArray( new int[] {1, 2, 3, 4});

        char[] chars = {'a', 'b', 'c', 'd'};
        System.out.println(chars[3]);
        System.out.println(chars);
        for (int i = 0; i <= chars.length  -1 ; i++)
            System.out.print(chars[i] + "  " );
        int[] nums = {0, 1};
        change(nums);
        printArray(nums);
    }
    public static void change(int[] nums) {
        nums[0] = 1;
        nums[1] = 0;
        System.out.println(nums[0]);
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "...");

    }
}
