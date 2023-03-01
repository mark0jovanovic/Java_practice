import java.util.Scanner;

public class LoopInJava2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int sum = 0;
//        while (sum <= 100){
//            System.out.print("Enter a number: ");
//            sum += sc.nextInt();
//            System.out.println(sum);
//
//
//
//        }
//        System.out.println("Done: " + sum);
//        do {
//            System.out.print("enter a number: ");
//            sum += sc.nextInt();
//            System.out.println(sum);
//        }while (sum <= 100);
//        System.out.println("Done: " + sum);
        int sum = 0;
        for (; sum <= 100; sum += sc.nextInt()){
            System.out.print("Enter a number: ");

        }



        System.out.println("Done " + sum);



    }
}
