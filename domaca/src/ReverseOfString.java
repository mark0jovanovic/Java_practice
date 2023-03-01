import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = sc.nextLine();
        String reverse = "";



        for (int i = input.length() - 1; i >= 0; i--){

            reverse += input.charAt(i);






        }
        System.out.print(reverse);

    }
}
