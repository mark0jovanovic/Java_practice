import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if (input % 2 == 0)
            System.out.println("Intiger is even");
        if (input % 2 != 0)
            System.out.println("Intiger is odd");
    }
}
