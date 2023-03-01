import java.util.Scanner;

public class Vaja6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0;
        int n = sc.nextInt();
        while( n > 0){
            sum += n % 10; //ABC
            n /= 10; //AB
        }
        System.out.println("sum = " + sum);

    }
}
