import  java.lang.*;

public class Predavanje_01 {
    static void odstevanje(int n) {
        for (int i  = n; i >= 0 ; i--) {
            System.out.printf("%d \n", i);
        }
    }

    public static void main(String[] args) {
        odstevanje(10);
    }
}
