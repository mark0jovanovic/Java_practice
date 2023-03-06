public class VsotaPrvih {
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
    public static int vsotaPrvih(int n) {

        int counter = 1;
        int sabiraj = 2;

            for (int i = 1; true; i++) {
                if (jePrastevilo(i) ) {
                    System.out.println(i);
                    sabiraj += i;
                    counter += 1;
                } else if (counter == n) {
                    break;

                }


            }
            return sabiraj;

    }

    public static void main(String[] args) {
        System.out.println( vsotaPrvih(100));

    }
}
