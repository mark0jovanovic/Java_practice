import java.util.Scanner;

public class IFelseExercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        if (operator == '+')
            System.out.println("Your result is: " + num1 + num2);
        else if (operator == '-')
            System.out.println("Your result is: " + (num1 - num2));
        else if (operator == '*')
            System.out.println("Your result is: " + num1 * num2);
        else if (operator == '/')
            System.out.println("Your result is: " + num1 / num2);
        else
            System.out.println("Someting gone wrong");






    }
}
