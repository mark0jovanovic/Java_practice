public class vaje1 {
    static public void main(String[] args){
        trikotnik(1, 5);
    }
    static void trikotnik(int odmik, int visina){

        for(int i = visina -1 ; i >= 0; i--){
            int sirina = 1 + i * 2;
            int stPresledkov = odmik + visina +1 - i;

            for(int j=0;j<stPresledkov; j++){
                System.out.print(" ");

            }
            for(int j=0;j<sirina; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
