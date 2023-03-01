import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInJava2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cocos");
        for (int i = 0; i < fruits.size(); i++)
            System.out.print(fruits.get(i) + " ");
        //sort array list sort()
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
