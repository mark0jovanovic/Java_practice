import java.util.Scanner;

public class Vaja2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int uneto = 0;
        int suma = 0;
        System.out.println("Tvoj prvi brpj- ");

        while (uneto < 100){
            uneto = sc.nextInt();
            suma = uneto + suma;
            if (suma < 100){
                continue;

            }
            else
                System.out.println("Done");
              return;






        }
        System.out.println("Done");




    }
}
