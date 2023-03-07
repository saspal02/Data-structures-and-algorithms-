import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x-coordinate of point 1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y-coordinate of point 1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x-coordinate of point 2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y-coordinate of point 2: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is " + distance);
        input.close();
    }
}
