public class LogicalOperators {
    public static void main(String[] args) {
//        and &&
//        or ||
//        not !
        boolean b1 = true && true;// true
        boolean b2 = b1 && false && true; // false
        boolean b3 = b2 || true; // true
        boolean b4 = !b2; // true
        boolean b5 = !(b4 && b2); // true
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        // if isRaining || isCold >> wear a jacket
        //if n >= 1 && n <= 10 >> n is between 1 in 10

    }
}
