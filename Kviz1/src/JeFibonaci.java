public class JeFibonaci {
    public static boolean jeFibonaccijevo(int n){
        long a1 = (long)(5 * Math.pow(n, 2) + 4);
        long a2 =(long)(5 * Math.pow( n, 2) - 4);
        long b1 = (long)Math.sqrt(a1);
        long b2 = (long)Math.sqrt(a2);

        if ((long)Math.pow(b1,2) == a1) {
            return true;
        } else if ((long)Math.pow(b2,2) == a2) {
            return true;
        }
        return false;


    }


    public static void main(String[] args) {
        System.out.println(jeFibonaccijevo(2021));
    }
}
