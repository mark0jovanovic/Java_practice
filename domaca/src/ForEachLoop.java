import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
//        for (TYPE VAR_NAME : ArrayList/Array){
//
//        }
        ArrayList<String> itemsArrayList = new ArrayList<>();
        itemsArrayList.add("item1");
        itemsArrayList.add("item2");
        itemsArrayList.add("item3");
        String[] itemsArray = {"item1", "item2", "item3"};
        for (String item : itemsArrayList)
            System.out.print(item + " ");
        System.out.println();
        for (String itemA : itemsArray)
            System.out.print(itemA + " ");
        System.out.println();
        int i = 0;
        int[] arr = {5, 2, 2, 0};
        for (Integer broj : arr)
            System.out.println(broj + " " + i++);
    }
}
