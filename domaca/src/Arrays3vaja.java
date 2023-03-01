import java.util.Arrays;

public class Arrays3vaja {
    public static void main(String[] args) {
        //fill(array, value)
        int[] numbers1 = new int[8]; // {0, 0, 0, 0, 0, 0, 0, 0}
        Arrays.fill(numbers1, 3); // {3, 3, 3, 3, 3, 3, 3, 3}
        //fill(array, fromIndex, toIndex, value
        int[] numbers2 = new int[8]; //{0, 0, 0, 0, 0, 0, 0, 0}
        Arrays.fill(numbers2, 3, 7, 5);//{0, 0, 0, 5, 5, 5, 5, 5, 0}
        String[] strings = new String[3]; // {null, null, null}
        Arrays.fill(strings, "Hello");//{Hello, Hello, Hello}
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(numbers2));

    }
}
