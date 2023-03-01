import java.util.Scanner;

public class Vaja8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter txt: ");
        String str = sc.nextLine();
        for (int i = 0; i <= str.length() - 1; i++){
            System.out.print(str.charAt(i) + " ");

        }


    }
}
