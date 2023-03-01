public class nicli {
    public static void nicli(int a , int b, int c) {
        double x1 =( -b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        double x2 =( -b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);

        if(Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.println("Napaka: nicli enacbe ne obstajata");
        }else {
            System.out.printf("x1=%.2f, x2=%.2f",x1, x2);

        }
    }

    public static void main(String[] args) {
        nicli(2,-16,30);
    }
}
