public class Increment_Decrement {
    public static void main(String[] args) {
        //increment operator
        //used to increase the value of variable by1
        //pre-icrement
        //++i
        //post-icrement
        //i++
//        int i = 4;
//        i++;
//        System.out.println(i);//5
//        int j = 5;
//        ++j;
//        System.out.println(j);
        int i1 = 1;
        int j1 = i1++ + 4;
        System.out.println("i1 is " + i1 + ", j1 is " + j1);

        int i = 1;
        int j = ++i + 4;
        System.out.println("i is " + i + ", j is " + j);
    }
}
