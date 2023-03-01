import java.util.Scanner;

public class Method1vezbe {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        System.out.println(getName());
        System.out.println("Enter your age: ");
        System.out.println(getAge());



    }
    public static  Integer getAge(){
        return new Scanner(System.in).nextInt();
    }
    public static String getName(){
        return new Scanner(System.in).nextLine();
    }
}
