public class StetjeBesed {
    public static void main(String[] args) {
        String[] besede = new String[] {
                "pomlad", "jabolko", "jesen", "zima", "lopar", "bor"
        };
        int[] stevci = new int[26];
        for (int i = 0; i < besede.length; i++){
            char c = besede[i].charAt(0);
            stevci[c-'a'] = stevci[c-'a'] + 1;
        }
        //ispis arraya
        for (int i = 0; i < 26; i++){
            System.out.printf("Stevilo besed na crko '%c' : %d\n",(i + 'a'), stevci[i]);
        }
    }
}
