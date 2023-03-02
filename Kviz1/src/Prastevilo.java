public class Prastevilo {
    public static boolean jePrastevilo (int n) {
        if (n > 1) {
            for (int i = 2; i <= n / 2 + 1; i ++) {
                if ((n % i) == 0) {
                    return false;
                }
            }return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(jePrastevilo(42));

    }
}
