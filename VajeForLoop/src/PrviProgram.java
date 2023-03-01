public class PrviProgram {
    public static void main(String[] args) {
        double p; //obresna mera
        int n; //stevilo let
        double G; //glavnica
        double Gn; //koncni znesek
        //inicijaliziranje spremenjljivke davanje vrednosti
        p = 5;
        n = 10;
        G = 1000;
        Gn = G * Math.pow(1 + p / 100,n);
        System.out.println("Glavnica: " + G);
        System.out.println("Stevilo let: " + n);
        System.out.println("Obresna mera: " + p);
        System.out.println("Koncni znesek: " + Gn);
    }
}
