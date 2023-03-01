import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println("Marko " + i);
//            i++;
//
//        }while (i <= 30);

        Scanner sc = new Scanner(System.in);

        int input;
        do {

            System.out.print("Enter a number between 1 and 10: ");
            input = sc.nextInt();

        }while (input < 1 || input > 10);
        System.out.println("Thanks");

    }
}
