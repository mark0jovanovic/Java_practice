public class DivisionOperator {
    public static void main(String[] args) {
//        int i1 = 1 / 2;// ok, int = int
//        //int i2 = 1.0 / 2;// error, int = double
//        int i3 = (int) (1.0 / 2);// ok, int = int
//        int i4 = (int) (1.0f / 2);// ok, int = int
//        int i5 = (int) 1.0f / 2;// ok, int = int
//        //int i6 = 1.0 / (int) 2;// error, int = float
//        double i7 = 1.0 / 2;// ok, double = double
//        double i8 = 1 / 2;// ok, double = int
//        double i9 = (double) 1 / 2;// ok, double = double
//        float i10 = 1.0f / 2.0f;// ok, float = float
//        float i11 = 1 / 2;// ok, float = int
        int i1 = 3;
        int i2 = 2;
        double d1 = 2;
        System.out.println(i1 / i2);//1
        System.out.println(i1 / d1);//1.5
        System.out.println((double) i1 / i2);//1.5
        System.out.println(i1 / (double) i2);//1.5
        System.out.println((double) i1 / (double) i2);//1.5
        System.out.println((double) (i1 / i2));//1.0





    }
}
