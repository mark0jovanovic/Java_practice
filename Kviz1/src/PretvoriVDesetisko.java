public class PretvoriVDesetisko {
    public static String pretvoriVDesetisko(String n, int b) {

        String mess = "";
        if(b == 2) {
            for (int i = 0; i < n.length(); i++ ){

                if ((n.charAt(i) != '1') && (n.charAt(i) != '0') ){
                    char charact = n.charAt(i);
                    mess  = String.format("Napaka pri pretvorbi sistema - števka %s",charact);
                }
            }
        } else if (b == 16) {
            String newString = "0123456789ABCDEF";
            for (int i = 0; i < n.length(); i++) {
                if (newString.indexOf(n.charAt(i)) == -1) {

                    mess  = String.format("Napaka pri pretvorbi sistema - števka %s",n.charAt(i));

                }

            }



        }else if (b == 8) {
            String newString = "01234567";
            for (int i = 0; i < n.length(); i++) {
                if (newString.indexOf(n.charAt(i)) == -1) {

                    mess  = String.format("Napaka pri pretvorbi sistema - števka %s",n.charAt(i));

                }

            }



        }


        try {
            int nnum = Integer.parseInt(n,b);

            String izpis = String.format("%s(%d)=%d(10)",n,b,nnum);

            return izpis;

        }catch (NumberFormatException e) {
            return mess;

        }



    }

    public static void main(String[] args) {
        System.out.println(pretvoriVDesetisko("1235", 7));

    }
}
