import java.util.Scanner;

public class Name_and_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name an age: ");
        String name = sc.next();
        double age = sc.nextDouble();
        System.out.println(name + "!" + " You are " + age + " years old!");

    }
}
