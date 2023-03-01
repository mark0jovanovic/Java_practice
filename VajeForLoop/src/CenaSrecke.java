public class CenaSrecke {
    public static void main(String[] args) {
        System.out.println("Stevilo sreck | Cena");
        System.out.println("--------------------");
        double cena = 1.25;
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %3d %10c %2.2f", i, '|', i * cena);
            System.out.println();
        }

    }
}
