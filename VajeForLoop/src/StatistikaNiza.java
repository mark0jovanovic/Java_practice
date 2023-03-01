public class StatistikaNiza {
    public static void main(String[] args) {
        String niz = "Danas je lep dan !";
        System.out.println("Niz: " + niz);
        System.out.println("Prva crtka: " + niz.charAt(0));
        System.out.println("Zadnja crtka: " + niz.charAt(niz.length() -1));
        String brezPresledkov = niz.replace(" ", "");
        System.out.println("Brez presledkov: " + brezPresledkov);
        String ocisceniNiz = niz.trim();
        ocisceniNiz = ocisceniNiz.replaceAll(" +", " ");
        int steviloBesed = ocisceniNiz.length() - brezPresledkov.length() ;

        System.out.println("Stevilo besed: " + steviloBesed);
        System.out.print("Obrnjeni niz: ");
        for (int i = niz.length()-1; i >=0; i = i-1){
            System.out.print(niz.charAt(i));
        }
        System.out.println();
    }
}
