import java.util.ArrayList;

public class ArrayListJava1 {
    public static void main(String[] args) {
        //Array list is resizable array
        ArrayList<Integer> integers; // null
        integers = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        //add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits); //[Apple, Banana, Strawberry]
//        fruits.add(0, "AtIndex 0");
//        System.out.println(fruits);
//        fruits.add(2, "AtIndex 2");
//        System.out.println(fruits);
        //using get() metod
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        //change an item set()
        fruits.set(2, "Orange");// change Strawberry to Orange
        System.out.println(fruits);
        //remove by index or by value remove()
        fruits.remove(1);
        System.out.println(fruits);
    }
}
