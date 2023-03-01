import java.util.Scanner;

public class JelkicaNaDesno {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= input - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2*i -1; k++)
                System.out.print("*");


            System.out.println();

        }



    }
}
