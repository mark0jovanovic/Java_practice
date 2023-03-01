import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int v1 = 1;
        int v2 = 1;
        int resoult = 0;
        for ( int i = 1; i <= n - 2; i++){

             resoult = v1 + v2;
             v1 = v2;
             v2 = resoult;

        }
        System.out.println("Your fibonacci number is: " + (resoult == 0 ? 1 : resoult));





    }
}
