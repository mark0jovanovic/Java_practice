public class Sekunde {
    String pretvoriSekunde(int sekunde) {
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


}
