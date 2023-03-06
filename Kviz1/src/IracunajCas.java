public class IracunajCas {
    public static String pretvoriSekunde(int sekunde) {
        if(sekunde < 0) {
            return "Število sekund ne more biti negativno";

        }else {
            String sekunde1 = Integer.toString(sekunde % 60);
            String minute = Integer.toString ((sekunde / 60)  % 60);
            String ure = Integer.toString((sekunde / 60) /60);
            if(sekunde1.length() < 2) {
                sekunde1 = "0" + sekunde1;
            }
            if (minute.length() < 2) {
                minute = "0" + minute;

            }
            if (ure.length() < 2) {
                ure = "0" + ure;

            }
            return   ure +":"+ minute+ ":" + sekunde1;

        }




    }
    public static String izracunajRazliko(String prviCas, String drugiCas) {
        String[] prvicas = prviCas.split(":");
        String[] drugicas = drugiCas.split(":");

        String ura1 = prvicas[0];
        String minute1 = prvicas[1];
        String sekunde1 = prvicas[2];

        String ura2 = drugicas[0];
        String minute2 = drugicas[1];
        String sekunde2= drugicas[2];

        int sekundePrvog = Integer.parseInt(ura1) * 3600 + Integer.parseInt(minute1) * 60 + Integer.parseInt(sekunde1);
        System.out.println(sekundePrvog);
        int sekundeDrugog = Integer.parseInt(ura2) * 3600 + Integer.parseInt(minute2) * 60 + Integer.parseInt(sekunde2);
        System.out.println(sekundeDrugog);




    return pretvoriSekunde(Math.abs(sekundePrvog - sekundeDrugog)) ;
    }

    public static void main(String[] args) {
        System.out.println( izracunajRazliko("08:23:10", "10:10:05"));
    }
}
