public class PitagorjevTrojcek {



    public static void pitagoroviTrojcki(int x) {
//        ki izpiše vse možne trojke (a, b, c) pri 1 <= a <= b <= c <= x za katere velja a2 + b2 = c2.
        for (int a = 1; a <= x; a++) {
            for (int b = 1; b <= x; b++ ) {
                for (int c = 1; c <= x; c++) {
                    if ((Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c,2)) ) {
                        if (a <= b ) {
                            if (b <= c) {
                                if (c <= x) {
                                    System.out.printf("%d %d %d \n", a, b, c);
                                }
                            }


                        }

                    }
                }
            }
        }



    }


    public static void main(String[] args) {
        pitagoroviTrojcki(25);
    }
}
