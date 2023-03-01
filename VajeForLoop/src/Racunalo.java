public class Racunalo {
    public static void main(String[] args) {
        if (args.length < 2)
            System.out.println("Napacno stevilo argumentov!");
        else
            System.out.println(args[0] + " + " + args[1] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}
