import java.util.Scanner;

public class Vaja7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");


        int result = 0;
        int v1 = 1;
        int v2 = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n - 2; i++){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("result = "+ (result == 0 ? 1 : result));
    }
}
