import java.util.Scanner;

public class IFelseStatements {
    public static void main(String[] args) {
//        if (true)
//            System.out.println("Hello");
//        else
//            System.out.println("cao");
//        if (true)
//            System.out.println("Inside of if statement");
//        else
//            System.out.println("Inside of else statement");
//        System.out.println("Outside of else statement");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if (input % 2 == 0)
            System.out.println(input + " Is even");
        else
            System.out.println(input + " is odd");
    }
}
