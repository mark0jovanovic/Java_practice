public class Java_je_zakon {
    public static void main(String[] args) {
        System.out.println("1. Java je ZAKON!");
        System.out.println("2. Java je ZAKON!");
        System.out.println("3. Java je ZAKON!");
        System.out.println("4. Java je ZAKON!");
        System.out.println("5. Java je ZAKON!");
        System.out.println();

        for (int i = 1; i <= 5; i++)
            System.out.println(i + ". Java je ZAKON!");
        //java je strogo tipiziran program
        //svaka spremenjljivka potrebuje deklaracijo
        System.out.println();

        int x = 7;
        int y = 5;
        System.out.printf("%d + %d = %d \n", x, y, x + y);
    }
}
