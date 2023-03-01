import java.util.Scanner;

public class Vaja3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= n/2; i++)
           // System.out.println(i);
            if(n % i == 0)
                sum += i;
        System.out.println(sum + n);



       // System.out.println(sum);
    }
}
