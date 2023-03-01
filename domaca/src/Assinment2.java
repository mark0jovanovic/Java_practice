import java.util.Scanner;

public class Assinment2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input % 2 ){
            case(0):
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;

        }
    }
}
