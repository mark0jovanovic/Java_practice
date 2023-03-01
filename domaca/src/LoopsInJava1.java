public class LoopsInJava1 {
    public static void main(String[] args) {

        for (int  i = 1; i <= 100; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");

        }
        System.out.println();
        for (int j = 100; j >= 1; j--){
            if (j % 2 == 0)
                System.out.print(j + " ");
        }
        System.out.println();
        int k = 1;
        while (k <= 100){
            if(k % 2 == 0)
                System.out.print(k + " ");
            k++;
        }
        System.out.println();
        int g = 100;
        while (g >= 1){
            if (g % 2 == 0)
                System.out.print(g + " ");
            g--;
        }
        System.out.println();
        int s = 1;
        do {
            if (s % 2 ==0)
                System.out.print(s + " ");
            s++;
        }while (s <= 100);
        System.out.println();
        do {
            if (s % 2 == 0)
                System.out.print( s + " ");
            s--;
        }while (s >= 1);



    }
}
