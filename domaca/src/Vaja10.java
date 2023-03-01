import java.util.Scanner;

public class Vaja10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0, j = str.length() -1; i < j; i++, j--){
            if (str.charAt(i) == str.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "palindrome" : "not palindrome");
    }
}
