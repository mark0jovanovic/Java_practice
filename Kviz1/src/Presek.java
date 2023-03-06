import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Presek {
    public static int[] presek(int[] tabela1, int[] tabela2) {


        String stringt1 = "";
        String string2 = "";
        String string3 = "";
        for (int i = 0; i < tabela1.length; i++) {
            stringt1 += tabela1[i] + ",";

        }
        for (int i = 0; i < tabela2.length; i++) {
            string2 += tabela2[i] + ",";

        }
        String[] string1 = stringt1.split(",");
        String[] stringt2 = string2.split(",");
        for (int i = 0; i < string1.length; i++) {

            for (int j = 0; j < stringt2.length; j++) {
                if (string1[i].equals(stringt2[j]) && !string3.contains(string1[i])) {
                    string3 += string1[i] + ",";

                }
            }
        }











        String[] a = string3.split(",");


         int[]z = new int[a.length];
         for (int i = 0; i < a.length; i++) {
             z[i] = Integer.parseInt(String.valueOf(a[i]));
         }

               
        return z;


    }

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 8, 16, 13, 2, 3, 2};
        int[] b = {13, 2, 1, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(presek(a, b)));
    }
}
