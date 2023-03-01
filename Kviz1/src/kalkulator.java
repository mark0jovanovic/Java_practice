public class kalkulator {
    public static void kalkulator(int a, int b) {
//        42 + 13 = 55
//        42 - 13 = 29
//        42 x 13 = 546
//        42 / 13 = 3
//        42 % 13 = 3
        if(b==0) {
            System.out.println("Napaka: deljenje z 0");
        }else {
            System.out.printf("%d + %d = %d\n", a, b, a + b);
            System.out.printf("%d - %d = %d\n", a, b, a - b);
            System.out.printf("%d x %d = %d\n", a, b, a * b);
            System.out.printf("%d / %d = %d\n", a, b, a / b);
            System.out.printf("%d %s %d = %d\n", a, "%", b, a % b);

        }



    }

    public static void main(String[] args) {
        kalkulator(42,0);
    }
}
