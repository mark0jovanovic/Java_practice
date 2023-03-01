public class Krog {
    public  static void krog(double r, int d) {
        double obseg = 2 * Math.PI * r;
        double ploscina = Math.PI * Math.pow(r, 2);
        if(r < 0 ) {
            System.out.println("Napaka: negativen polmer");

        } else if (d < 0) {
            System.out.println("Napaka: negativen d");

        }else {
            String stevilod = "" + d;
            System.out.println(stevilod);

            System.out.printf("Obseg kroga s polmerom r=%.2f je %."  + stevilod +"f\n",r, obseg);
            System.out.printf("Ploscina kroga s polmerom r=%.2f je %." + stevilod +"f" ,r, ploscina);

        }


//        Obseg kroga s polmerom r=7.50 je 47.124
//        Ploscina kroga s polmerom r=7.50 je 176.715

    }

    public static void main(String[] args) {
        krog(7.5,3);
    }
}
