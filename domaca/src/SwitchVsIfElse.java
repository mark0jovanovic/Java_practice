public class SwitchVsIfElse {
    public static void main(String[] args) {

    int n = 90;
    switch (n) {
        case 10:
            System.out.println("=10");
            break;
        case 90:
            System.out.println("=90");
            break;
        case -3:
            System.out.println("= -3");
            break;
        default:
            System.out.println("Non of above");
        }
    }
}
