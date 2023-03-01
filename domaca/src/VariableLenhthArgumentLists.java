import java.util.Scanner;

public class VariableLenhthArgumentLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a number1: ");
//        int input = sc.nextInt();
//        System.out.println("Enter a number2: ");
//        int input2 = sc.nextInt();
//        System.out.println("Result is " + sum(input, input2));
        int[] numbers = {1, 7, -2};
        System.out.println(sum(numbers));
        System.out.println(sum(new int[]{1, 7, -2}));





    }
    void print(String name, double... numbers){

    }
    public static int sum(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum;
    }
}
