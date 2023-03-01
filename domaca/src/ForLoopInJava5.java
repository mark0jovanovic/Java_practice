import java.util.Scanner;

public class ForLoopInJava5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int max = n;
        int min = n;
        if (n >= 0){
            while (true){
                System.out.print("Enter a number: ");
                n = sc.nextInt();

                if (n < 0)
                    break;
                if (n > max)
                    max = n;
                if (n < min);
                min = n;
            }
            System.out.println("min = "+ min + ", max = "+ max);
        }
        else
            System.out.println(n + " is invalid");





    }
}
