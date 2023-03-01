import java.util.Scanner;

public class PoprecaOcena {
    public static void main(String[] args) {
        int n = 0;
        int vsota = 0;
        int vpisnaOcena = -1;
        Scanner sc = new Scanner(System.in);
        while (vpisnaOcena != 0) {
            System.out.print("Vpisi ocen: ");
            vpisnaOcena = sc.nextInt();
            if (vpisnaOcena != 0){
                vsota = vsota + vpisnaOcena;
                n = n + 1;
            }
        }
        if (n == 0){
            System.out.println("Nisi upisal nobene ocene");
        }
        else {
            double poprecje = (double) vsota / n;
            System.out.printf("Poprecje ocen: %.2f\n", poprecje);
        }
    }
}
