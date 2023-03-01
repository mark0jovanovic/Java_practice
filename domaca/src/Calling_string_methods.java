import java.util.Locale;

public class Calling_string_methods {
    public static void main(String[] args) {
        String s1 = "Marko Jovanovic";
        //toUpperCase(), toLowerCase()

        System.out.println(s1.toUpperCase());
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        //s1.length()

        int i =s1.length();
        System.out.println(i);
        //isEmpty()
        System.out.println(s1.isEmpty());
        //isBlank
        //bolian if string have spaces

        //charAt
        String s3 = "abcda";
        char c = s3.charAt(3);
        System.out.println(c);
        //indexOf(), lastIndexOf()
        System.out.println(s1.indexOf('a'));
        System.out.println(s3.lastIndexOf('a'));

        //concat()

        String s4 = s1.concat(" Academy");
        System.out.println(s4);


    }
}
