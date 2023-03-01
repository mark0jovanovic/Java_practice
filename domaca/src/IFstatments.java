public class IFstatments {
    public static void main(String[] args) {

        if (true)
            System.out.println("Hello world!");
        if(false)
            System.out.println("False");
        if (false)
            System.out.println("Inside the if statement");
        System.out.println("Outside the if statement");
        if (true){
            System.out.println("Inside the if statement");
            System.out.println("Inside the if statement");
        }
        System.out.println("Outside the if statement");
        int x = 5;
        int y = 10;
        if (x > y)
            System.out.println("The maximum is " + x);
        if (y > x)
            System.out.println("The maximum is " + y);


    }
}
