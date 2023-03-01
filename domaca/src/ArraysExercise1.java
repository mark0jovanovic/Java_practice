import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements? (MAx is 20): ");
        int input = sc.nextInt();
        while (input > 20 || input <= 0){
            System.out.println("Invalid number try again: ");
            input = sc.nextInt();

        }
        int[] numbers = new int[input];
        fillArrayOfIntigers(numbers);
        printArrayOfInigers(numbers);

    }

    private static void printArrayOfInigers(int[] numbers) {
        System.out.println("Elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntigers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
    }
}
