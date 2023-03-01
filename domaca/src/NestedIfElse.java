import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 10)
            System.out.println("Greater than 10");
        else if (input == 10)
            System.out.println("Equal to 10");
        else
            System.out.println("Less than 10");
    }
}
