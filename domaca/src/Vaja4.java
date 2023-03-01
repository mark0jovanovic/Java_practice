import java.util.Scanner;

public class Vaja4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++)
            if (n % i == 0){
                isPrime = false;
                //System.out.println("not prime");
                break;
            }
        System.out.println(isPrime ? "prime" : "not prime");



    }
}
