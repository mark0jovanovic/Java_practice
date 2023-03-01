import java.util.Scanner;

public class BreakandContinue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0)
                continue;
            System.out.println(i + " ");
        }
        int n;
        while (true){
            System.out.println("enter a number between 1 and 10: ");
            n = sc.nextInt();
            if (n < 1 || n > 10)
                continue;
            System.out.println(n + " is between 1 and 10.");
            break;

        }
    }
}
