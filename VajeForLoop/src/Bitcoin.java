import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.ENGLISH);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        String minD = "", maxD = "";
        Scanner sc = new Scanner(new File("viri/bitcoin.txt"));
        while (sc.hasNext()) {
            String datum = sc.next();
            double vrednost = sc.nextDouble();

            if (vrednost < min) {
                min = vrednost;
                minD = datum;
            }
            if (vrednost > max) {
                max = vrednost;
                maxD = datum;
            }
            System.out.println(vrednost);
        }
        sc.close();

        System.out.printf("Najmansa vrednost: %.2f (%s)\n", min, minD);
        System.out.printf("Najmansa vrednost: %.2f (%s)\n", max, maxD);
    }
}
