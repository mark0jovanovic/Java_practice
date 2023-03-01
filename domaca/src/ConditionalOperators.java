public class ConditionalOperators {
    public static void main(String[] args) {
        //operator  that evaluates an expresion based on a condition
        //booleanexpr ? expr1 : expr2
        int a = 10;
        int b = 15;
        int max = a > b ? a : b;
        System.out.println(max);
        String name = "Marko Jovanovic";
        System.out.println(name.isEmpty() ? "The name is not valid" : name);
        System.out.println(!name.isEmpty() ? name : "Blablabla");

    }
}
