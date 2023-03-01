import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DN03 {
    public static void main(String[] args) throws  FileNotFoundException{
        String filename = args[0];
        int passLen = Integer.parseInt(args[1]);
        int seed = Integer.parseInt(args[2]);
        Scanner sc = new Scanner(new File(filename));
        int stVrstic = sc.nextInt();
        String[] besede = new String[stVrstic];
        for(int i=0; i < stVrstic; i++){
            String vrstica = sc.next();
            besede[i] = vrstica;
        }
        Random rnd = new Random(seed);
        String geslo = " ";
        for(int i=0; i < passLen; i++ );{
            int nakljucnaBeseda_indeks = 0 + rnd.nextInt(stVrstic - 0);
            String nakljucnaBeseda = besede[nakljucnaBeseda_indeks];
            int nakljZnak_indeks = 0 + rnd.nextInt(nakljucnaBeseda.length() - 0);
            char nakljucenZnak = nakljucnaBeseda.charAt(nakljZnak_indeks);
            geslo += nakljucenZnak;
        }
        System.out.println(geslo);

    }
}
