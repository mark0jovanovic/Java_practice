public class JeDvojcek {
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
    public static void praDvojcek(int n) {
        for (int i = 1; i < n; i++) {


            if ((jePrastevilo(i) && (jePrastevilo(i + 2))) && (i + 2 < n) ){
                System.out.printf("(%d, %d)\n", i, i + 2 );

            }
        }
    }

    public static void main(String[] args) {
        praDvojcek(10);
    }
}
