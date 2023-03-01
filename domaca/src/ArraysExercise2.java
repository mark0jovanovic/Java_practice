import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements? (MAx is 20): ");
        int n = input.nextInt();
        while (n > 20 || n <= 0){
            System.out.println("Invalid number try again: ");
            n = input.nextInt();

        }
        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);

    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("Elements are: ");

        for (int i = 0; i < points.length; i++)
            System.out.print("(" + points[i].x + ", " + points[i].y + ")");
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter x and y: ");

        for (int i = 0; i < points.length; i++){
            System.out.print("Enter x and y for point " + (i + 1) + ": ");

            points[i] = new Point(input.nextInt(), input.nextInt());

        }

    }
}
