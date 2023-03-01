public class JeFibonaci {
    public static boolean jeFibonaccijevo(int n){
        double a1 = (5 * Math.pow(n, 2)) + 4;
        double a2 = (5 * Math.pow( n, 2)) - 4;
        double b1 = Math.sqrt(a1);
        double b2 = Math.sqrt(a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(Math.pow(b1,2));
        System.out.println(Math.pow(b2,2));

        if (Math.pow(b1,2) == a1) {
            return true;
        } else if (Math.pow(b2,2) == a2) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(jeFibonaccijevo(2021));
    }
}
