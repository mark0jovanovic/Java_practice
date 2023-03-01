public class CastinginJava {
    public static void main(String[] args) {
        //CONVERTING A DATA TYPE TO ANOTHER TYPE
        //implicite casting is happening automaticly
//        double d1 = 4;// int>>double
//        double d2 = 5.7f; // float>>double
//        long l1 = 100; // int>>long
        //explicit casting
//        int i1 = 4.5;//error
//        int i2 = 8L;//error
//        float = 4.5;//error
        int i1 = (int) 4.5;//4 (data loss)
        int i2 = (int) 8L;//8
        float f1 = (float) 4.5;//4.5F


    }
}
