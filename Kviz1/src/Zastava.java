public class Zastava {
    public static void izrisiZastavo(int n) {
        String prvaVrstica = "";
        String drugaVrstica = "";
        String brezZvezdic = "";
        for (int i = 0; i < 15 * n + 1; i++) {
            brezZvezdic += "=";
        }


        for (int i = 0; i < 15 * n  + 1 - (4 * n / 2) ; i++) {

            if (i < 4 * n / 2) {
                prvaVrstica += "* ";



            }else {
                prvaVrstica += "=";

            }



        }

        for (int i = 0; i < 15 * n + 1 - (4 * n  / 2 - 1); i++) {

            if (i < 4 * n  / 2 - 1) {

                drugaVrstica += " *";





            }else if( i < 4 * n / 2  + 1 ) {
                drugaVrstica += " ";
            }else {


                drugaVrstica += "=";


            }



        }
        for (int i = 1; i <= n * 5; i++) {
            if (i <= 3 * n) {
                if (i % 2 == 0){
                    System.out.println(drugaVrstica);

                }else {
                    System.out.println(prvaVrstica);
                }

            }else {
                System.out.println(brezZvezdic);
            }

        }
        
        
        



    }

    public static void main(String[] args) {
        izrisiZastavo(1);
    }
}
