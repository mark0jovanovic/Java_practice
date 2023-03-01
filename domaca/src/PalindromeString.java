import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0, j = input.length() -1; i < j; i ++, j--){
            if (input.charAt(i) == input.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "is Palnidrome" : "Not palindrome");


    }
}
