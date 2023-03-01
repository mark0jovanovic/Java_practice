import java.util.Scanner;

public class WhileLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        while ( input < 1 || input > 10){
            System.out.print(input + " is not between 1 and 10. Try again: ");
            input = sc.nextInt();

        }
        System.out.println("Thanks");

    }
}
