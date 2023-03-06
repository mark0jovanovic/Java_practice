public class TrikotnikStevil {




    public static void trikotnik(int n, int tip) {
        if (tip  == 1) {
            for (int vrstica = 1; vrstica <= n; vrstica++) {
                for (int stolpec = 0; stolpec < vrstica; stolpec++) {
                    System.out.print((stolpec + 1) % 10 + " ");
                }
                System.out.println();
            }

        } else if (tip == 2) {
            String premik = "";

            for (int vrstica = n; vrstica > 0; vrstica--) {


                for (int stolpec = 0; stolpec < vrstica; stolpec++) {
                    System.out.print((stolpec + 1) % 10  + " ");




                }
                premik += "  ";
                System.out.println();
                System.out.print(premik);
            }

        } else if (tip == 3) {
            String premik = "" ;
            int counter = n;





            for (int vrstica = 1; vrstica <= n; vrstica++) {
                for (int i = counter; i > 1 ; i--) {
                    premik += "  ";

                }

                System.out.print(premik);
                for (int stolpec = vrstica; stolpec > 0; stolpec--) {


                    System.out.print( (stolpec  ) % 10 + " ");





                }
                counter--;
                premik = "";

                System.out.println();




            }







        } else if (tip == 4) {
            for (int vrstica = n; vrstica > 0; vrstica--) {
                for (int stolpec = vrstica; stolpec > 0; stolpec--) {
                    System.out.print((stolpec ) % 10 + " ");
                }
                System.out.println();
            }

        } else if (tip == 5) {
            String premik = "" ;
            int counter = n;



            for (int i = 1; i <= n; i++) {
                for (int i1 = counter; i1 > 1 ; i1--) {
                    premik += "  ";

                }
                System.out.print(premik);

                for (int j = 1; j <= i; j++) {

                    System.out.print(j % 10 + " ");
                }


                for (int j = i - 1; j >= 1; j--) {

                    System.out.print(j % 10 + " ");
                }
                System.out.print(premik);
                System.out.println();
                counter--;
                premik = "";




            }




        } else if (tip == 6) {
            String premik = "";
            for (int i = n; i >= 0; i--) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(j % 10 + " ");
                }


                for (int j = i - 1; j >= 1; j--) {

                    System.out.print(j % 10 + " ");




                }
                premik += "  ";
                System.out.println();
                System.out.print(premik);
            }

        } else if (tip == 7) {
            int vrstice = n, k = 0, count = 0, count1 = 0;

            for (int i = 1; i <= vrstice; ++i) {
                for (int odmik = 1; odmik <= vrstice - i; ++odmik) {
                    System.out.print("  ");
                    ++count;
                }

                while (k != 2 * i - 1) {
                    if (count <= vrstice - 1) {
                        System.out.print((i + k) % 10 + " ");
                        ++count;
                    } else {
                        ++count1;
                        System.out.print((i + k - 2 * count1) % 10 + " ");
                    }

                    ++k;
                }
                count1 = count = k = 0;

                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
//        trikotnik(5,1);
//        trikotnik(5, 2);
        trikotnik(15,6);

    }
}
