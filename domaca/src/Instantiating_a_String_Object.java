import java.awt.*;

public class Instantiating_a_String_Object {
    public static void main(String[] args) {

        Point point = new Point(1, 2);

        //Cat tom = new Cat("Tom");
        System.out.println(point);

        String name1 = "Marko Jovanovic";
        String name2 = new String("Marko Jovanovic");

        System.out.println(name1);
        System.out.println(name2);
    }
}
