public class MethodsInjava {
    public static void main(String[] args) {

        System.out.println(sum(2,3));
        System.out.println(sum1(2,2));
        sayHi();
    }

    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static int sum1(int x, int y){
        return x + y;
    }
    public static void sayHi() {
        System.out.println("Hi");
    }

}
