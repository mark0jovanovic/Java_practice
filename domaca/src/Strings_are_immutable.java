public class Strings_are_immutable {
    public static void main(String[] args) {
        String str = "Old Value";
        str = "New Value";
        System.out.println(str);
        String str1 = "Value1";
        String str2 = str1;
        str2 = "Value2";
        System.out.println(str1);
        System.out.println(str2);

    }
}
