import java.lang.reflect.Array;

public class Vdesetisko {
    int zbir = 0;
    public static void vDesetisko (int n) {

        //505(8) = 325(10)
        String mess = "";



        char osem = '8';
        char devet = '9';
        for (int i = 0; i < Integer.toString(n).length(); i++ ){

            if (Integer.toString(n).charAt(i) == osem ){

               mess  = "Število " + n +" ni število v osmiškem sistemu (števka 8)";

            } else if (Integer.toString(n).charAt(i) == devet ) {

                mess  = "Število " + n +" ni število v osmiškem sistemu (števka 9)";

            }

        }

        try {
            String nstring = Integer.toString(n);
            int nnum = Integer.parseInt(nstring,8);
            System.out.printf("%d(8) = %d(10)",n, nnum);

        }catch (NumberFormatException e) {
            System.out.println(mess);



        }


    }


    public static void main(String[] args) {
        vDesetisko(345878);
    }
}
