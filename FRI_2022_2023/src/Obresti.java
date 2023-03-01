public class Obresti {


    public static void main(String[] args) {

        double glavnica = 1000.0; // glavnica (realno == double)

        int n = 10;            // stevilo let vezave

        double p = 5.0;             // letna obrestna mera

        double vrednost = glavnica * Math.pow(1 + p/100,n );

        System.out.printf("Vrednost po %d letih: %.2f\n",n,vrednost);
        System.out.printf("%s %s %s %.2f", "Vrednost po", n, " letih: ", vrednost);



    }
}
