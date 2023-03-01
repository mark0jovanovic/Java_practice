import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class Vaja9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter txt: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() -1 ; i>= 0; i--){

           // System.out.print(str.charAt(i));
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);



    }
}
