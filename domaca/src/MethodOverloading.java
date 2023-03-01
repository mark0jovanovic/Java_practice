public class MethodOverloading {
    public static void main(String[] args) {
        sayHi("Marko Jovanovic");
    }
    public static void sayHi(String name){
        System.out.println("Hi");
        System.out.println("Hi " + name);
    }
}
