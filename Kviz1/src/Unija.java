import java.util.Arrays;

public class Unija {
     public static int[] unija(int[] tabela1, int[] tabela2) {
         int counter = tabela1.length;
        int[] i = new int[tabela1.length + tabela2.length];
        for (int j = 0; j < tabela1.length;j++){
            i[j] = tabela1[j];
        }
        for (int k = 0; k < tabela2.length;k++){
            i[counter] = tabela2[k];
            counter ++;
        }
        return i;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3};
        int[] b = {4, 5, 6, 7};
        System.out.println(Arrays.toString(unija(a, b)));
    }


}
