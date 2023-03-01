import java.util.Scanner;

public class StringWhitSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a txt: ");
        String input = sc.nextLine();
        for (int i = 0; i <= input.length() - 1; i++){
            System.out.print(input.charAt(i) + " ");
        }


    }
}
