import java.util.Random;

public class Loto {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 1; i <= 7; i++) {
            int x = 1 + rnd.nextInt(39);
            System.out.println(x + " ");
        }
        System.out.println();
    }

}
