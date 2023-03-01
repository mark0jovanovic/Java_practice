public class Concatinating_Strings {
    public static void main(String[] args) {
        //adding Strings to each other
        String part1 = "Marko";
        String part2 = "Jovanovic";
        String space = " ";
        String full = part1 + " " + part2;
        System.out.println(part1 + part2);//Marko Jovanovic
        System.out.println(part1 + space + part2);//Marko Jovanovic
        System.out.println(full);//Marko Jovanovic
        System.out.println("My number " + 5 + 3); //My Number 53
        System.out.println("marko " + "Jovanovic" + (5+3)); //marko Jovanovic8
        System.out.println("Marko".concat(" Jovanovic").concat(" 5"));// Marko Jovanovic 5



    }
}
